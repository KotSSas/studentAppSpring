package com.example.studentappspring.service.impl;

import com.example.studentappspring.entity.Student;
import com.example.studentappspring.repository.StudentRepository;
import com.example.studentappspring.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl extends StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
