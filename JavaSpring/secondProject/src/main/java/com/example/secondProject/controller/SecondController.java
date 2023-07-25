package com.example.secondProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {
    @GetMapping("/2T")
    public String test(Model model){
        model.addAttribute("username","윤석");
        return "secondTest";
    }
}
