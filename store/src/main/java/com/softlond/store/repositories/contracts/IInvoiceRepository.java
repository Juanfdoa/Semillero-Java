package com.softlond.store.repositories.contracts;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.softlond.store.entities.Invoice;

public interface IInvoiceRepository extends JpaRepository<Invoice, Long>{
    @Query(value = "SELECT * FROM invoice WHERE client_id = :client", nativeQuery = true)
    public List<Invoice> invoicesByClient(@Param ("client") Long client);

    @Query(value = "SELECT * FROM invoice WHERE date >= :initial AND date <= :final", nativeQuery = true)
    public List<Invoice> invoicesByDateRange(@Param ("initial") LocalDate initialDate, @Param ("final") LocalDate finalDate);

    @Query(value = "SELECT * FROM invoice WHERE client_id = :client AND date >= :initial AND date <= :final", nativeQuery = true)
    public List<Invoice> invoicesByClientAndDateRange(@Param ("client") Long client ,@Param ("initial") LocalDate initialDate, @Param ("final") LocalDate finalDate);
}
