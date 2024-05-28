package com.example.RestAPI_using_SpringBoot.Controller;

import com.example.RestAPI_using_SpringBoot.Model.JobPost;
import com.example.RestAPI_using_SpringBoot.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.*;
import java.util.List;

@RestController
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postid){
        return service.getJob(postid);
    }

    @PostMapping("/jobPost")
    public void addJob(@RequestBody JobPost jobPost){
        System.out.println(jobPost.toString());
        service.addJobPost(jobPost);
    }

}
