package com.erp.placement_erp.Controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.erp.placement_erp.Dto.EligibleOrganisationDTO;
import com.erp.placement_erp.Dto.PlacementStudentRequest;
import com.erp.placement_erp.Filter.JWTFilter;
import com.erp.placement_erp.Service.StudentService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
@RequiredArgsConstructor

public class StudentController {
    private final StudentService studentService;
    private static final Logger logger = LoggerFactory.getLogger(JWTFilter.class);

    @GetMapping("/offers")
    public List<EligibleOrganisationDTO> getStudents(@RequestHeader("Authorization") String token) {



        return studentService.getAllStudents(token);
    }
    @PostMapping("/apply")
    public ResponseEntity<String> createCustomer(@RequestBody @Valid PlacementStudentRequest request, @RequestHeader(HttpHeaders.AUTHORIZATION) String authorizationToken) {

        return ResponseEntity.ok(studentService.createPlacementStudent(request,authorizationToken));
    }


}