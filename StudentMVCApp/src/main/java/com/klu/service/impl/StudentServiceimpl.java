package com.klu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.klu.model.Student;
import com.klu.service.StudentService;

@Service
public class StudentServiceimpl implements StudentService {

    private final List<Student> studentList = new ArrayList<>();

    @Override
    public String getWelcomeMessage() {
        return "Welcome to Student MVC";
    }

    // CREATE
    @Override
    public Student createStudent(Student student) {
        studentList.add(student);
        return student;
    }

    // READ - Get by ID
    @Override
    public Student getStudentById(int id) {
        return studentList.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElseThrow(() -> 
                    new IllegalArgumentException("Student not found with id: " + id));
    }

    // READ - Get All
    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(studentList);  // return copy (best practice)
    }

    // UPDATE
    @Override
    public Student updateStudent(int id, Student student) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                student.setId(id); // ensure ID remains same
                studentList.set(i, student);
                return student;
            }
        }
        throw new IllegalArgumentException("Student not found with id: " + id);
    }

    // DELETE
    @Override
    public String deleteStudent(int id) {
        Student student = getStudentById(id);
        studentList.remove(student);
        return "Student record deleted successfully";
    }

    // SEARCH BY NAME
    @Override
    public List<Student> searchStudent(String name) {
        List<Student> result = new ArrayList<>();
        for (Student s : studentList) {
            if (s.getName().equalsIgnoreCase(name)) {
                result.add(s);
            }
        }
        return result;
    }
}