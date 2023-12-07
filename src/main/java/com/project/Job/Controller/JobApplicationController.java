package com.project.Job.Controller;

import com.project.Job.Entity.JobApplication;
import com.project.Job.Repository.JobApplicationRepository;
import com.project.Job.Service.JobApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/job-application")
public class JobApplicationController {

    @Autowired
    private JobApplicationService jobApplicationService;

    @GetMapping("/applications")
    public List<JobApplicationRepository> getAllJobApplications() {
        return jobApplicationService.getAllJobApplications();
    }

    @GetMapping("/applications/{id}")
    public JobApplication getJobApplicationById(@PathVariable Long id) {
        return jobApplicationService.getJobApplicationById(id);
    }

    @PostMapping("/applications")
    public JobApplication createJobApplication(@RequestBody JobApplication jobApplication) {
        return jobApplicationService.createJobApplication(jobApplication);
    }

    @DeleteMapping("/applications/{id}")
    public void deleteJobApplication(@PathVariable Long id) {
        jobApplicationService.deleteJobApplication(id);
    }
}
