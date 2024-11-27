package com.erp.placement_erp.Mapper;

import com.erp.placement_erp.Dto.PlacementStudentRequest;
import com.erp.placement_erp.Entity.Placement;
import com.erp.placement_erp.Entity.Placement_Student;
import com.erp.placement_erp.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class Placement_StudentMapper {
    public Placement_Student toEntity(PlacementStudentRequest request, int studentId) {
        return Placement_Student.builder()
                .placement_id(Placement.builder().placement_id(request.placementId()).build()) // Map Placement entity
                .student_id(Student.builder().studentId(studentId).build()) // Map Student entity
                .cv_application(request.cvApplication()) // CV file path or description
                .about(request.about()) // Additional student-provided details
                .date(new Date()) // Current timestamp
                .build();
    }

}
