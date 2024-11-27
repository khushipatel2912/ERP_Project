package com.erp.placement_erp.Service;

import com.erp.placement_erp.Dto.EligibleOrganisationDTO;
import com.erp.placement_erp.Dto.LoginRequest;
import com.erp.placement_erp.Dto.PlacementStudentRequest;
import com.erp.placement_erp.Entity.Placement_Student;
import com.erp.placement_erp.Entity.Student;
import com.erp.placement_erp.Filter.JWTFilter;
import com.erp.placement_erp.Helper.CustomUserDetails;
import com.erp.placement_erp.Helper.JWTHelper;
import com.erp.placement_erp.Mapper.Placement_StudentMapper;
import com.erp.placement_erp.Repo.Placement_StudentRepo;
import com.erp.placement_erp.Repo.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import static java.lang.String.format;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService implements UserDetailsService  {
    private final StudentRepo studentRepo;
    @Autowired
    private final BCryptPasswordEncoder passwordEncoder;
    private final JWTHelper jwtHelper;
    private final Placement_StudentMapper mapper;
    private final Placement_StudentRepo repo;
    private static final Logger logger = LoggerFactory.getLogger(JWTFilter.class);

    public String login(LoginRequest request) {
        Student student = studentRepo.findByEmail(request.email())
                .orElseThrow(() -> new UsernameNotFoundException("Student not found with email: " + request.email()));
        boolean matches = passwordEncoder.matches(request.password(), student.getPassword());

        if(!matches){
            return "Wrong Password or Email";
        }
        return jwtHelper.generateToken(request.email());

    }
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.debug("Loading user details for username: {}", username);
        Student student = studentRepo.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("Employee not found with email: " + username));
        return new CustomUserDetails(student); // Wrapping Customer in CustomUserDetails
    }
    public List<EligibleOrganisationDTO> getAllStudents(String t )
    {
        String token = t.substring(7);
        String email = jwtHelper.extractUsername(token);
        logger.debug("Loading user details in api call for username: {}", email);

        Student student = studentRepo.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Employee not found with email: " + email));


        return studentRepo.findEligibleOrganisations(student.getStudentId());
    }
    public String createPlacementStudent(PlacementStudentRequest request,String t) {
        String token = t.substring(7);
        String email = jwtHelper.extractUsername(token);
        // logger.debug("Loading user details in api call for username: {}", email);

        Student student = studentRepo.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Employee not found with email: " + email));


        Placement_Student placement_student = mapper.toEntity(request,student.getStudentId());
        repo.save(placement_student);
        return "Created";
    }

}