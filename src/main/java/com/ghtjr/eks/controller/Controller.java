package com.ghtjr.eks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/greetings")
    public String message() {
        return "Hi, I'm Hoseok\n" +
                "It's so hard because I only did hard things \n" +
                "But I'm gonna do it. There's nothing easy in the world";
    }
}
