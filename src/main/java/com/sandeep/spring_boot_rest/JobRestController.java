package com.sandeep.spring_boot_rest;

import com.sandeep.spring_boot_rest.model.JobPost;
import com.sandeep.spring_boot_rest.service.JobService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {
    @Autowired
    private JobService jobService;

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable int postId) {
        return jobService.getJob(postId);
    }

    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost) {
        jobService.addJobPost(jobPost);
        /* return jobService.getJob(JobPost.getpostId()); */
        return jobPost;
    }

    @PutMapping("jobPost")
    public  JobPost updateJobPost(@RequestBody JobPost jobPost) {
        jobService.updatejob(jobPost);
        return jobPost;
    }

    @DeleteMapping("jobPost")
    public void deleteJobPost(@RequestBody JobPost jobPost) {
        jobService.deletejob(jobPost);
    }

}
