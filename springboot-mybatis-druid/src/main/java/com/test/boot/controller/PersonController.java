package com.test.boot.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.boot.dto.Person;
import com.test.boot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    PersonService personService;

    @RequestMapping("/person/import")
    public String test() throws JsonProcessingException {
        Person person = personService.selectByPrimaryKey(1);

        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(person);
    }

    @RequestMapping("/add")
    public String add() throws Exception {
        Person person = new Person();
        person.setId(12348);
        person.setName("lisi");
        person.setAge(22);
        personService.savePerson(person);
        return "hello";
    }
}
