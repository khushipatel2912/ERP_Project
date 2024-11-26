package com.erp.placement_erp.Service;

import com.erp.placement_erp.Entity.Student;
import com.erp.placement_erp.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public Student login(String email, String password) {
        Student student = studentRepo.findByEmail(email);
        if (student != null && passwordEncoder.matches(password, student.getPassword())) {
            return student;
        }
        return null;
    }
}
