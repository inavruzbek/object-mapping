package com.ivoyant.object.mapping.controller;

import com.ivoyant.object.mapping.dto.PersonDTO;
import com.ivoyant.object.mapping.entity.Person;
import com.ivoyant.object.mapping.service.PersonService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;

@RestController
@RequestMapping("/person")
public class PersonController {
    private final PersonService personService;
    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    @PostMapping
    public ResponseEntity<Person> savePerson(@RequestBody Person person){
        personService.savePerson(person);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(person);
    }
    @GetMapping
    public Person getPerson() {
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setDob(LocalDate.of(1997, 3, 21));
        return person;
    }
}
