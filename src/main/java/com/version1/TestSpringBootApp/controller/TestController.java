package com.version1.TestSpringBootApp.controller;

import com.version1.TestSpringBootApp.model.Person;
import com.version1.TestSpringBootApp.repository.PersonRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

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
    @Transactional
    public Person testPostController(@RequestBody @Valid Person person) {
        Person p = personRepository.save(person);
        System.out.println(p.getFirstName() + " " + p.getSurname());
        return p;
    }

}
