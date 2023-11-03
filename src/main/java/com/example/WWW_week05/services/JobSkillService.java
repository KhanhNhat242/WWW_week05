package com.example.WWW_week05.services;

import com.example.WWW_week05.models.JobSkill;
import com.example.WWW_week05.repositories.JobSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSkillService {
    @Autowired
    private JobSkillRepository jobSkillRepository;

    public void createOrUpdate(JobSkill jobSkill){
        jobSkillRepository.save(jobSkill);
    }

    public List<JobSkill> findAll(){
        return jobSkillRepository.findAll();
    }
}
