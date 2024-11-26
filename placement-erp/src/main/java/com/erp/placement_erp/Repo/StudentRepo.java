package com.erp.placement_erp.Repo;

import com.erp.placement_erp.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
    Student findByEmail(String email);
}
