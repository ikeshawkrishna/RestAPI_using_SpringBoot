package com.example.RestAPI_using_SpringBoot.Service;

import com.example.RestAPI_using_SpringBoot.Model.JobPost;
import com.example.RestAPI_using_SpringBoot.Repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    public JobRepo repo;

    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();
    }

    public void addJobPost(JobPost jobPost) {
        repo.addJob(jobPost);
    }

    public JobPost getJob(int postId) {
        return repo.getjob(postId);
    }
}
