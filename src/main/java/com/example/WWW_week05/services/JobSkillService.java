package com.example.WWW_week05.services;

import com.example.WWW_week05.models.JobSkill;
import com.example.WWW_week05.repositories.JobSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobSkillService {
    @Autowired
    private JobSkillRepository jobSkillRepository;

    public void createOrUpdat(JobSkill jobSkill){
        jobSkillRepository.save(jobSkill);
    }
}
