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

    @PostMapping("/checkLogin")
    public Boolean checkLogin(@RequestBody String email){
//        System.out.println(email.substring(1, email.length()-1));
        String e = email.substring(1, email.length()-1);
//        System.out.println(companyService.findByEmail(e));
        if(companyService.findByEmail(e) != null)
            return true;
        return false;
    }
}
