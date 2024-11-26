package com.erp.placement_erp.Controller;

import com.erp.placement_erp.Entity.Student;
import com.erp.placement_erp.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
private StudentService studentService;
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody @Valid Student loginRequest) {
        if (loginRequest.getEmail() == null || loginRequest.getPassword() == null) {
            return ResponseEntity.badRequest().body("Email and password must not be null");
        }

        Student student = studentService.login(loginRequest.getEmail(), loginRequest.getPassword());
        if (student != null) {
            return ResponseEntity.ok(student);
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }
}