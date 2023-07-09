package com.aedemirsen.springboot_mongodb.mapper;

import com.aedemirsen.springboot_mongodb.document.Student;
import com.aedemirsen.springboot_mongodb.dto.StudentDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IStudentMapper {
    Student toStudent(StudentDto studentDto);

    StudentDto fromStudent(Student student);
}
