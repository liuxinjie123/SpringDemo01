package com.demo.controller;

import com.demo.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@RequestMapping(value = "person")
@Controller(value = "personController")
public class PersonController {
    @Resource(name = "personService")
    private PersonService personService;

    @PostMapping
    public String add() {
        personService.addPerson();
        return "SUCCESS";
    }

}
