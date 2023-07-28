package com.example.thirdproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewController {

    @GetMapping("/start")
    public String start(Model model){
        model.addAttribute("name","학생");
    return "new";
    }
}
