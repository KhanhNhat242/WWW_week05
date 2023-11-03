package com.example.WWW_week05.controllers;

import com.example.WWW_week05.models.JobSkill;
import com.example.WWW_week05.services.JobSkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://127.0.0.1:5173")
public class JobSkillController {
    @Autowired
    private JobSkillService jobSkillService;

    @GetMapping("/findAllJobSkill")
    public List<JobSkill> findAll(){
        return jobSkillService.findAll();
    }
}
