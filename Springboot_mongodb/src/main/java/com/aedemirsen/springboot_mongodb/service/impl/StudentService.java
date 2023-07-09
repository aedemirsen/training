package com.aedemirsen.springboot_mongodb.service.impl;

import com.aedemirsen.springboot_mongodb.document.Student;
import com.aedemirsen.springboot_mongodb.repository.IStudentRepository;
import com.aedemirsen.springboot_mongodb.service.interfaces.IStudentService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService implements IStudentService {

    private final IStudentRepository studentRepository;

    public StudentService(IStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student findStudentById(String id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student insertStudent(Student student) {
        return studentRepository.insert(student);
    }
}
