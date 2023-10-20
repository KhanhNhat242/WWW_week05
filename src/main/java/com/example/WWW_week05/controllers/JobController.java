package com.example.WWW_week05.controllers;

import com.example.WWW_week05.models.Job;
import com.example.WWW_week05.services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://127.0.0.1:5173")
public class JobController {
    @Autowired
    private JobService jobService;

    @PostMapping("/addJob")
    public void add(@RequestBody Job j){
        jobService.createOrUpdate(j);
    }

    @GetMapping("/getAllJob")
    public List<Job> getAll(){
        return jobService.getAll();
    }
}
