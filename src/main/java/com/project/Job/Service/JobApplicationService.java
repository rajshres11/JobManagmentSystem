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

    public List<JobApplicationRepository> getAllJobApplications() {
        return jobApplicationRepository.findAll();
    }

    public JobApplicationRepository getJobApplicationById(Long id) {
        return jobApplicationRepository.findById(id).orElse(null);
    }

    public JobApplication createJobApplication(JobApplication jobApplication) {
        S save = jobApplicationRepository.save(jobApplication);
        return save;
    }



    public void deleteJobApplication(Long id) {
        jobApplicationRepository.deleteById(id);
    }
}