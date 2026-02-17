package com.klu.service;

import java.util.List;

import com.klu.model.Student;

public interface StudentService {

    Student addStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(Long id);

    void deleteStudent(Long id);
}