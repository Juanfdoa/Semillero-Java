package com.softlond.store.services.contracts;

import java.time.LocalDate;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.softlond.store.entities.Invoice;
import com.softlond.store.entities.Invoice_Details;

public interface IInvoiceService {
    public ResponseEntity<List<Invoice>> findAll();
    public ResponseEntity<Invoice> findById(Long id);
    public ResponseEntity<List<Invoice>> findByClientId(String clientId);
    public ResponseEntity<List<Invoice>> findByDateRange(LocalDate initialDate, LocalDate finalDate);
    public ResponseEntity<List<Invoice>> findByClientAndDateRange(String clientId, LocalDate initialDate, LocalDate finalDate);
    public ResponseEntity<Invoice> create(Invoice invoice, List<Invoice_Details> details);
    public ResponseEntity<Invoice> update(Invoice invoice);
    public ResponseEntity<Boolean> Delete(Long id);
}
