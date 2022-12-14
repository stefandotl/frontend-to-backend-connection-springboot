package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
public class MyController {

    @GetMapping("/person")
    @ResponseBody
    public Map<String, String> getPerson() {
        Map<String, String> person = new HashMap<>();
        person.put("name", "John Doe");
        person.put("age", "42");
        return person;
    }

}