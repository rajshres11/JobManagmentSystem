package com.project.Job.Service;

import com.project.Job.Entity.JobApplication;
import com.project.Job.Repository.JobApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobApplicationService {

    @Autowired
    private JobApplicationRepository jobApplicationRepository;


    public List<JobApplication> getAllJobApplications() {
        return jobApplicationRepository.findAll();
    }

    public JobApplication getJobApplicationById(Long id) {
        return jobApplicationRepository.findById(id).orElse(null);
    }

    public JobApplication createJobApplication(JobApplication jobApplication) {
        return jobApplicationRepository.save(jobApplication);
    }



    public void deleteJobApplication(Long id) {
        jobApplicationRepository.deleteById(id);
    }
}