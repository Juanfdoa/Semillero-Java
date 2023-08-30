package com.softlond.store.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.softlond.store.entities.Client;
import com.softlond.store.repositories.contracts.IClientRepository;
import com.softlond.store.services.contracts.IClientService;

@Service
public class ClientService implements IClientService {

    @Autowired
    private IClientRepository clientRepository;

    @Override
    public ResponseEntity<List<Client>> findAll() {
        ResponseEntity<List<Client>> response = new ResponseEntity<List<Client>>(HttpStatus.OK);
        try {
            List<Client> clients = this.clientRepository.findAll();
            response = new ResponseEntity<List<Client>>(clients, HttpStatus.OK);
            return response;
        } catch (Exception e) {
            response = new ResponseEntity<List<Client>>(HttpStatus.INTERNAL_SERVER_ERROR);
            return response;
        }
    }

    @Override
    public ResponseEntity<Client> findById(Long id) {
        ResponseEntity<Client> response = new ResponseEntity<Client>(HttpStatus.OK);
        try {
            Client client = this.clientRepository.findById(id).get();
            response = new ResponseEntity<Client>(client, HttpStatus.OK);
            return response;
        } catch (Exception e) {
            response = new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
            return response;
        }
    }

    @Override
    public ResponseEntity<Client> create(Client client) {
        try {
            Client clientSaved = this.clientRepository.save(client);
            return new ResponseEntity<Client>(clientSaved, HttpStatus.OK);
       } catch (IllegalArgumentException e) {
            return new ResponseEntity<Client>(HttpStatus.BAD_REQUEST);
       } catch (Exception e) {
            return new ResponseEntity<Client>(HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }

    @Override
    public ResponseEntity<Client> update(Client client) {
        try {
            Client clientToUpdate = this.clientRepository.save(client);
            return new ResponseEntity<Client>(clientToUpdate, HttpStatus.OK);
       } catch (Exception e) {
            return new ResponseEntity<Client>(HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }

    @Override
    public ResponseEntity<Boolean> Delete(Long id) {
        try {
            this.clientRepository.deleteById(id);
            return new ResponseEntity<Boolean>(true, HttpStatus.OK);
       } catch (Exception e) {
            return new ResponseEntity<Boolean>(HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }

   
    
}
