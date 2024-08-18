package com.springboot.sms.service;

import java.util.List;

import com.springboot.sms.model.Student;

public interface StudentService {
	List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student updateStudent(Student student);
    Student getStudentById(Long id);
    void deleteStudentById(Long id);
}
