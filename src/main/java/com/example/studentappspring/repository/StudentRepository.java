package com.example.studentappspring.repository;

import com.example.studentappspring.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
