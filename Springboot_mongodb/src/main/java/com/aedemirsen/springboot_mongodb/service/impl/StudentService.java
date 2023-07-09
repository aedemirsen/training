package com.aedemirsen.springboot_mongodb.service.impl;

import com.aedemirsen.springboot_mongodb.document.Student;
import com.aedemirsen.springboot_mongodb.exception.StudentAlreadyExistsException;
import com.aedemirsen.springboot_mongodb.exception.StudentNotFoundException;
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
        return studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException("Student not found with the given ID."));
    }

    @Override
    public Student insertStudent(Student student) {
        var existingStudent = studentRepository.findById(student.getId()).orElse(null);
        if(existingStudent != null){
            throw new StudentAlreadyExistsException("Student already exists with the given ID.");
        }
        return studentRepository.insert(student);
    }
}
