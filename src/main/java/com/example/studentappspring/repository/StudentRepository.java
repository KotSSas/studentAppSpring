package com.example.studentappspring.repository;

import com.example.studentappspring.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
