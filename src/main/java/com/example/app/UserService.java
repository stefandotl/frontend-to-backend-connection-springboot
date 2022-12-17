package com.example.app;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    public Map<String, String> getUser() {
        User tom = new User("Tom", 32);
        Map<String, String> user = new HashMap<>();
        user.put("name", tom.getName());
        user.put("age", String.valueOf(tom.getAge()));
        return user;
    }

}
