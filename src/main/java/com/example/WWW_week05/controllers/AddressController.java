package com.example.WWW_week05.controllers;

import com.example.WWW_week05.models.Address;
import com.example.WWW_week05.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping("/save")
    public Address save(@RequestBody Address a){
        return addressService.createOrUpdate(a);
    }

    @GetMapping("/findAll")
    public List<Address> findAll(){
        return addressService.findAll();
    }
}
