package com.aedemirsen.springboot_mongodb.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Getter
@Setter
public class StudentDto {
    private String id;
    private String name;
    private String lastName;
    private int age;
    private String email;
}
