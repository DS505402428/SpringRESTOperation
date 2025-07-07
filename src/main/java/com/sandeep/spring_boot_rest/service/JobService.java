package com.sandeep.spring_boot_rest.service;

import com.sandeep.spring_boot_rest.model.JobPost;
import com.sandeep.spring_boot_rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
@Service
public class JobService {

    @Autowired
    private JobRepo  jobRepo;

    public void addJobPost(JobPost jobPost){

        jobRepo.addJobPost(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return jobRepo.getAllJobs();

    }

    public JobPost getJob(int postId) {

        return jobRepo.getJob();
    }

    public void updatejob(JobPost jobPost) {
        jobRepo.updateJob(jobPost);
    }

    public void deletejob(JobPost jobPost) {
        jobRepo.deletejob(jobPost);
    }
}


