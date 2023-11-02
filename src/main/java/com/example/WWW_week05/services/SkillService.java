package com.example.WWW_week05.services;

import com.example.WWW_week05.models.Skill;
import com.example.WWW_week05.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService {
    @Autowired
    private SkillRepository skillRepository;

    public void createOrUpdate(Skill s){
        skillRepository.save(s);
    }
}
