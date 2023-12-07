package com.project.Job.Service;

import com.project.Job.Entity.Admin;
import com.project.Job.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    public Admin getAdminById(Long id) {
        return adminRepository.findById(id).orElse(null);
    }

    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }

    public Admin updateAdmin(Long id, Admin updatedAdmin) {
        Admin existingAdmin = adminRepository.findById(id).orElse(null);
        if (existingAdmin != null) {
            // Update fields based on your requirements
            existingAdmin.setUsername(updatedAdmin.getUsername());
            existingAdmin.setPassword(updatedAdmin.getPassword());
            return adminRepository.save(existingAdmin);
        }
        return null;
    }
}
