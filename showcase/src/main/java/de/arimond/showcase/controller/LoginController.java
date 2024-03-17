package de.arimond.showcase.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("login")
public class LoginController {
    @RequestMapping(value = "/token",  method = RequestMethod.POST)
    public String greeting(@RequestParam("token") String token) {
        return token;
    }
}