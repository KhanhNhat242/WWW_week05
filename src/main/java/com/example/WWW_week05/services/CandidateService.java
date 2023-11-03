package com.example.WWW_week05.services;

import com.example.WWW_week05.models.Candidate;
import com.example.WWW_week05.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {
    @Autowired
    private CandidateRepository candidateRepository;

    public void createOrUpdate(Candidate c){
        candidateRepository.save(c);
    }

    public List<Candidate> findAll(){
        return candidateRepository.findAll();
    }
}
