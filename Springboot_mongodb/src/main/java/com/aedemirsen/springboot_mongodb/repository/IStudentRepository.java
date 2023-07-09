package com.aedemirsen.springboot_mongodb.repository;

import com.aedemirsen.springboot_mongodb.document.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends MongoRepository<Student, String> {

}
