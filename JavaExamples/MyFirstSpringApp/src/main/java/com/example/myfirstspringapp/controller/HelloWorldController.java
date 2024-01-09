package com.example.myfirstspringapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @GetMapping(path = "/hello")
    public String hello(Model model) {
        model.addAttribute("hello","Hello,World!");
        return "hello";
    }

    @PostMapping(path = "/post")
    public String nameToUpperCase(Model model, @RequestParam String name,@RequestParam String surname) {
        String fullName=name+" "+surname;
        fullName=fullName.toUpperCase();
        model.addAttribute("fullname",fullName);
        return "fullname";
    }
}

