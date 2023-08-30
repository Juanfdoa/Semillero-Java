package com.softlond.store.services.implementations;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.softlond.store.entities.Client;
import com.softlond.store.entities.Invoice;
import com.softlond.store.entities.Invoice_Details;
import com.softlond.store.entities.Product;
import com.softlond.store.repositories.contracts.IInvoice_DetailsRepository;
import com.softlond.store.repositories.contracts.IProductRepository;
import com.softlond.store.repositories.contracts.IClientRepository;
import com.softlond.store.repositories.contracts.IInvoiceRepository;
import com.softlond.store.services.contracts.IInvoiceService;


@Service
public class InvoiceService implements IInvoiceService{

    @Autowired
    private IInvoiceRepository invoiceRepository;
    @Autowired
    private IInvoice_DetailsRepository invoiceDetailsRepository;
    @Autowired
    private IProductRepository productRepository;
    @Autowired
    private IClientRepository clientRepository;


    @Override
    public ResponseEntity<List<Invoice>> findAll() {
        ResponseEntity<List<Invoice>> response = new ResponseEntity<List<Invoice>>(HttpStatus.OK);
        try {
            List<Invoice> invoices = this.invoiceRepository.findAll();
            response = new ResponseEntity<List<Invoice>>(invoices, HttpStatus.OK);
            return response;
        } catch (Exception e) {
            response = new ResponseEntity<List<Invoice>>(HttpStatus.INTERNAL_SERVER_ERROR);
            return response;
        }
    }

    @Override
    public ResponseEntity<Invoice> findById(Long id) {
        ResponseEntity<Invoice> response = new ResponseEntity<Invoice>(HttpStatus.OK);
        try {
            Invoice invoice = this.invoiceRepository.findById(id).get();
            response = new ResponseEntity<Invoice>(invoice, HttpStatus.OK);
            return response;
        } catch (Exception e) {
            response = new ResponseEntity<Invoice>(HttpStatus.NOT_FOUND);
            return response;
        }
    }

    @Override
    public ResponseEntity<List<Invoice>> findByClientId(String clientId) {
        ResponseEntity<List<Invoice>> response = new ResponseEntity<List<Invoice>>(HttpStatus.OK);
        try {
            Client client = this.clientRepository.getClientByDocument(clientId);
            List<Invoice> invoices = this.invoiceRepository.invoicesByClient(client.getId());
            response = new ResponseEntity<List<Invoice>>(invoices, HttpStatus.OK);
            return response;
        } catch (Exception e) {
            response = new ResponseEntity<List<Invoice>>(HttpStatus.NOT_FOUND);
            return response;
        }
    }

    @Override
    public ResponseEntity<List<Invoice>> findByDateRange(LocalDate initialDate, LocalDate finalDate) {
        ResponseEntity<List<Invoice>> response = new ResponseEntity<List<Invoice>>(HttpStatus.OK);
        try {
            List<Invoice> invoices = this.invoiceRepository.invoicesByDateRange(initialDate, finalDate);
            response = new ResponseEntity<List<Invoice>>(invoices, HttpStatus.OK);
            return response;
        } catch (Exception e) {
            response = new ResponseEntity<List<Invoice>>(HttpStatus.NOT_FOUND);
            return response;
        }
    } 

    @Override
    public ResponseEntity<List<Invoice>> findByClientAndDateRange(String clientId, LocalDate initialDate, LocalDate finalDate) {
        ResponseEntity<List<Invoice>> response = new ResponseEntity<List<Invoice>>(HttpStatus.OK);
        try {
            Client client = this.clientRepository.getClientByDocument(clientId);
            List<Invoice> invoices = this.invoiceRepository.invoicesByClientAndDateRange(client.getId(), initialDate, finalDate);
            response = new ResponseEntity<List<Invoice>>(invoices, HttpStatus.OK);
            return response;
        } catch (Exception e) {
            response = new ResponseEntity<List<Invoice>>(HttpStatus.NOT_FOUND);
            return response;
        }
    }

    @Override
    public ResponseEntity<Invoice> create(Invoice invoice, List<Invoice_Details> details) {
        try {
            //consultar invoice by client
            LocalDate actualDate = LocalDate.now();
            LocalDate initialDate = actualDate.minusDays(31);
            List<Invoice> invoices = this.invoiceRepository.invoicesByClientAndDateRange(invoice.getClient().getId(), initialDate, actualDate);
            Double last30Days = 0.0;
            if (invoices.size() > 0) {
                for (Invoice invoiceClient : invoices) {
                    last30Days += invoiceClient.getTotal();
                }
            }

            //Crear invoice
            Invoice invoiceSave = this.invoiceRepository.save(invoice);
            Double totalInvoice = invoiceSave.getTotal();
            for (Invoice_Details detail : details) {
                detail.setInvoice(invoiceSave);

                Product product = this.productRepository.findById(detail.getProduct().getId()).get();
                Double totalDetail = product.getPrice() * detail.getQuantity();
                detail.setTotal(totalDetail);
                totalInvoice += totalDetail;
                this.invoiceDetailsRepository.save(detail);
            }
            invoiceSave.setTotal(totalInvoice);
            this.invoiceRepository.save(invoiceSave);

            //validar si merece el descuento por comprar mas de 1000000 en los ultimos 30 dias
            if(last30Days > 1000000){
                invoiceSave.setDiscount("10%");
                invoiceSave.setTotalWithDiscount(totalInvoice * 0.9);
                this.invoiceRepository.save(invoiceSave);
            }else{
                invoiceSave.setDiscount("0%");
                invoiceSave.setTotalWithDiscount(totalInvoice);
                this.invoiceRepository.save(invoiceSave);
            }

            //Game discount
            Integer random = (int) (Math.random() * 3) + 1;
            Boolean condition = true;
            Integer count = 0;
            Double totalwithOneDiscount = invoiceSave.getTotalWithDiscount();
           do {
            switch (random) {
                case 1:
                    invoiceSave.setGameDiscount("Descuento definido por la empresa: 10%");
                    invoiceSave.setTotalWithDiscount(totalwithOneDiscount * 0.9);
                    condition = false;
                    this.invoiceRepository.save(invoiceSave);
                    break;
                case 2:
                    invoiceSave.setGameDiscount("Nuevo intento");
                    invoiceSave.setTotalWithDiscount(totalwithOneDiscount);
                    this.invoiceRepository.save(invoiceSave);
                    break;
                case 3:
                    invoiceSave.setGameDiscount("No ganaste");
                    invoiceSave.setTotalWithDiscount(totalwithOneDiscount);
                    condition = false;
                    this.invoiceRepository.save(invoiceSave);
                    break;
                default:
                    break;
            }
           } while (condition && count < 3);
            
            return new ResponseEntity<Invoice>(invoiceSave, HttpStatus.OK);
       } catch (IllegalArgumentException e) {
            return new ResponseEntity<Invoice>(HttpStatus.BAD_REQUEST);
       } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<Invoice>(HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }

    @Override
    public ResponseEntity<Invoice> update(Invoice invoice) {
        try {
            Invoice invoiceToUpdate = this.invoiceRepository.save(invoice);
            return new ResponseEntity<Invoice>(invoiceToUpdate, HttpStatus.OK);
       } catch (Exception e) {
            return new ResponseEntity<Invoice>(HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }

    @Override
    public ResponseEntity<Boolean> Delete(Long id) {
        try {
            this.invoiceRepository.deleteById(id);
            return new ResponseEntity<Boolean>(true, HttpStatus.OK);
       } catch (Exception e) {
            return new ResponseEntity<Boolean>(HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }
}
