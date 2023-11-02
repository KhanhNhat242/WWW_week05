package com.example.WWW_week05.controllers;

import com.example.WWW_week05.enums.Country;
import com.example.WWW_week05.models.*;
import com.example.WWW_week05.services.CompanyService;
import com.example.WWW_week05.services.JobService;
import com.example.WWW_week05.services.JobSkillService;
import com.example.WWW_week05.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://127.0.0.1:5173")
public class CompanyController {
    @Autowired
    private CompanyService companyService;
    @Autowired
    private JobService jobService;
    @Autowired
    private SkillService skillService;
    @Autowired
    private JobSkillService jobSkillService;
    private Company currentCompany;
    private Job currentJob;
    private Skill currentSkill;

    @PostMapping("/addCompany")
    public void add(@RequestBody Company c){
        companyService.createOrUpdate(c);
    }

    @GetMapping("/getAllCompany")
    public List<Company> getAll(){
        return companyService.getAll();
    }

    @PostMapping("/checkLogin")
    public String checkLogin(@RequestBody String email){
//        System.out.println(email.substring(1, email.length()-1));
        String e = email.substring(1, email.length()-1);
//        System.out.println(companyService.findByEmail(e));
        if(companyService.findByEmail(e) != null){
            currentCompany = companyService.findByEmail(e);
            return companyService.findByEmail(e).getCompName();
        }
        return "fail";
    }

    @PostMapping("/addJob")
    public void addJob(@RequestBody Job j){
        currentJob = new Job(j.getJobName(), j.getJobDesc(), currentCompany);
        jobService.createOrUpdate(currentJob);
    }

    @PostMapping("/addSkill")
    public void addSkill(@RequestBody Skill s){
        currentSkill = s;
        skillService.createOrUpdate(s);
    }

    @PostMapping("/addJobSkill")
    public void addJobSkill(@RequestBody JobSkill jobSkill){
        JobSkill jk = new JobSkill(jobSkill.getMoreInfos(), jobSkill.getSkillLevel(), currentSkill, currentJob);
        jobSkillService.createOrUpdat(jk);
    }
}
