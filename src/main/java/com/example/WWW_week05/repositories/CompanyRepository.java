package com.example.WWW_week05.repositories;

import com.example.WWW_week05.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
    Company findCompanyByEmail(String email);
}
