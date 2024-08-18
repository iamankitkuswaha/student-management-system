package com.springboot.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.sms.model.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

}
