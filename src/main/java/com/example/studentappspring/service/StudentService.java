package com.example.studentappspring.service;

import com.example.studentappspring.entity.Student;

import java.util.List;

public abstract class StudentService {
    public abstract List<Student> getAllStudents();
}
