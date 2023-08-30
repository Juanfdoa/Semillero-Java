package com.softlond.store.controllers;

import com.softlond.store.constants.ApiConstants;
import com.softlond.store.entities.Invoice;
import com.softlond.store.entities.Invoice_Details;
import com.softlond.store.services.contracts.IInvoiceService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiConstants.INVOICE)
public class InvoiceController {

    @Autowired
    private IInvoiceService invoiceService;
    
    @GetMapping(ApiConstants.LIST)
    public ResponseEntity<List<Invoice>> getAllInvoices(){
        return this.invoiceService.findAll();
    }
      
    @GetMapping(ApiConstants.INVOICE_CLIENT)
    public ResponseEntity<List<Invoice>> getInvoicesByClient(String id){
        return this.invoiceService.findByClientId(id);
    }

    @GetMapping(ApiConstants.FIND_BY_ID)
    public ResponseEntity<Invoice> getInvoiceById(Long id){
        return this.invoiceService.findById(id);
    }

    @GetMapping(ApiConstants.INVOICE_DATE)
    public ResponseEntity<List<Invoice>> getInvoicesByDateRange(LocalDate initialDate, LocalDate finalDate){
        return this.invoiceService.findByDateRange(initialDate, finalDate);
    }

    @GetMapping(ApiConstants.INVOICE_CLIENT_DATE)
    public ResponseEntity<List<Invoice>> getInvoicesByClientAndDateRange(String id, LocalDate initialDate, LocalDate finalDate){
        return this.invoiceService.findByClientAndDateRange(id, initialDate, finalDate);
    }

    @PostMapping(ApiConstants.CREATE)
    public ResponseEntity<Invoice> create(@RequestBody Invoice invoice){
        List<Invoice_Details> details = invoice.getDetails();
        invoice.setDetails(new ArrayList<>());
        this.invoiceService.create(invoice, details);
        return ResponseEntity.ok(invoice);
        
    }

    @PutMapping(ApiConstants.UPDATE)
    public ResponseEntity<Invoice> update(@RequestBody Invoice invoice){
        return this.invoiceService.update(invoice);
    }

    @DeleteMapping(ApiConstants.DELETE)
    public ResponseEntity<Boolean> delete(@RequestParam Long id){
        return this.invoiceService.Delete(id);
    }
}
