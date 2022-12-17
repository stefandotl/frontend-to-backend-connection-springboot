package com.example.app;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
