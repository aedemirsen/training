package com.aedemirsen.springboot_mongodb.service.interfaces;

import com.aedemirsen.springboot_mongodb.document.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAllStudents();
    Student findStudentById(String id);
    Student insertStudent(Student student);
}
