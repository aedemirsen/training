package com.example.springboot_swagger.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private String surname;
    private int age;

    public static List<User> dummyUsers(){
        User u1 = new User("Ahmet","Ak",25);
        User u2 = new User("Mehmet","Yeşil",26);
        User u3 = new User("Ayşe","Mavi",24);
        return List.of(u1,u2,u3);
    }

}
