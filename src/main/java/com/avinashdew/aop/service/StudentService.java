package com.avinashdew.aop.service;

import com.avinashdew.aop.entity.Student;
import com.avinashdew.aop.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    public Student addStudent(Student s){
        return studentRepository.save(s);
    }
}
