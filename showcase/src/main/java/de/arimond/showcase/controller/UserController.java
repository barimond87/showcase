package de.arimond.showcase.controller;

import de.arimond.showcase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService;

    
    @RequestMapping(value = "/data",  method = RequestMethod.GET)
    public String getData() {
        return "This is a message from the gods!";
    }
}