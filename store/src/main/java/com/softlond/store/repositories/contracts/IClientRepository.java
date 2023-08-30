package com.softlond.store.repositories.contracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.softlond.store.entities.Client;

public interface IClientRepository extends JpaRepository<Client, Long> {
    @Query(value = "SELECT * FROM client WHERE document_number = :client", nativeQuery = true)
    public Client getClientByDocument(@Param ("client") String client);
}
