package com.example.WWW_week05.controllers;

import com.example.WWW_week05.models.Address;
import com.example.WWW_week05.models.Candidate;
import com.example.WWW_week05.services.AddressService;
import com.example.WWW_week05.services.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://127.0.0.1:5173")
public class CandidateController {
    @Autowired
    private CandidateService candidateService;
    @Autowired
    private AddressService addressService;
    private Address currentAddress;

    @PostMapping("/addAddresss")
    public void addJobb(@RequestBody Address a){
        addressService.createOrUpdate(a);
        currentAddress = a;
    }

    @PostMapping("/addCandidate")
    public void addCandidate(@RequestBody Candidate c){
        Candidate ca = new Candidate(c.getDob(), c.getEmail(), c.getFullName(), c.getPhone(), currentAddress);
        candidateService.createOrUpdate(ca);
    }
}
