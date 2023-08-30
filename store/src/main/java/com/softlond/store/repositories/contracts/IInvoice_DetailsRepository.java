package com.softlond.store.repositories.contracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softlond.store.entities.Invoice_Details;

public interface IInvoice_DetailsRepository extends JpaRepository<Invoice_Details, Long>{
    
}
