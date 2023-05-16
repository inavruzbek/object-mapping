package com.ivoyant.object.mapping.controller;

import com.ivoyant.object.mapping.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @GetMapping("/person")
    public Person getPerson() {
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        return person;
    }
}
