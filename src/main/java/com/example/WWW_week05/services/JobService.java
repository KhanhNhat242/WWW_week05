package com.example.WWW_week05.services;

import com.example.WWW_week05.models.Job;
import com.example.WWW_week05.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    public void createOrUpdate(Job j){
        jobRepository.save(j);
    }

    public void delete(long id){
        jobRepository.deleteById(id);
    }

    public Job findById(long id){
        return jobRepository.findById(id).get();
    }

    public List<Job> getAll(){
        return jobRepository.findAll();
    }
}
