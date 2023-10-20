package com.example.WWW_week05.controllers;

import com.example.WWW_week05.models.Company;
import com.example.WWW_week05.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://127.0.0.1:5173")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @PostMapping("/addCompany")
    public void add(@RequestBody Company c){
        companyService.createOrUpdate(c);
    }

    @GetMapping("/getAllCompany")
    public List<Company> getAll(){
        return companyService.getAll();
    }
}
