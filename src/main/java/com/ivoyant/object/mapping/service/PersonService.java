package com.ivoyant.object.mapping.service;
import com.ivoyant.object.mapping.entity.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    public void savePerson(Person person) {

        System.out.println("Saving person: " + person);
    }
}

