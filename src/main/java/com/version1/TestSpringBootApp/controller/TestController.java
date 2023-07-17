package com.version1.TestSpringBootApp.controller;

import com.version1.TestSpringBootApp.model.Person;
import com.version1.TestSpringBootApp.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {

    private final PersonRepository personRepository;

    public TestController(PersonRepository personRepo) {
        this.personRepository = personRepo;
    }

    @GetMapping
    public String testController() {
        return "Hello Everyone";
    }

    @PostMapping
    public Person testPostController() {
        return personRepository.save(new Person("Alex", "Bloomfield"));
    }

}
