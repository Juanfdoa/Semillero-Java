package com.softlond.store.controllers;

import java.util.List;

import com.softlond.store.constants.ApiConstants;
import com.softlond.store.entities.Client;
import com.softlond.store.services.contracts.IClientService;

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
@RequestMapping(ApiConstants.CLIENT)
public class ClientController {
    @Autowired
    private IClientService clientService;

    @GetMapping(ApiConstants.LIST)
    public ResponseEntity<List<Client>> getAllClients(){
        return this.clientService.findAll();
    }

    @GetMapping(ApiConstants.FIND_BY_ID)
    public ResponseEntity<Client> getClientById(Long id){
        return this.clientService.findById(id);
    }

    @PostMapping(ApiConstants.CREATE)
    public ResponseEntity<Client> create(@RequestBody Client client){
        return this.clientService.create(client);
    }

    @PutMapping(ApiConstants.UPDATE)
    public ResponseEntity<Client> update(@RequestBody Client client){
        return this.clientService.update(client);
    }

    @DeleteMapping(ApiConstants.DELETE)
    public ResponseEntity<Boolean> delete(@RequestParam Long id){
        return this.clientService.Delete(id);
    }
}
