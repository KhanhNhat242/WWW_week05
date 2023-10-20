package com.example.WWW_week05.services;

import com.example.WWW_week05.models.Company;
import com.example.WWW_week05.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    public void createOrUpdate(Company c){
        companyRepository.save(c);
    }

    public void delete(long id){
        companyRepository.deleteById(id);
    }

    public Company findById(long id){
        return companyRepository.findById(id).get();
    }

    public List<Company> getAll(){
        return companyRepository.findAll();
    }
}
