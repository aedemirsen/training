package com.aedemirsen.springboot_mongodb.exception;

public class StudentAlreadyExistsException extends RuntimeException{
    public StudentAlreadyExistsException(String message){
        super(message);
    }
}
