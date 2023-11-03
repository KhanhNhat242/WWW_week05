package com.example.WWW_week05.controllers;

import com.example.WWW_week05.enums.Country;
import com.example.WWW_week05.models.Address;
import com.example.WWW_week05.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://127.0.0.1:5173")
public class AddressController {
    @Autowired
    private AddressService addressService;

//    @PostMapping("/addAddress")
//    public Address save(@RequestBody Address a){
////        Address add = new Address("sdg", "asd",);
//        return addressService.createOrUpdate(a);
//    }

    @GetMapping("/findAllAddress")
    public List<Address> findAll(){
        return addressService.findAll();
    }
}
