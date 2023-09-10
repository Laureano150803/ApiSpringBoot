package com.unicolombo.ApiRestFull.ApiRestFull.repository;

import com.unicolombo.ApiRestFull.ApiRestFull.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <Student, Long> {
}
