package com.example.secondProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) { // 외부에서 param 을 받음
        model.addAttribute("name", name);
        return "hello-template";
    }
    @GetMapping("hello-string")
    @ResponseBody // http의 body에 param으로 받은 data를 직접 넣어줌
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name; // param으로 받은 게 그대로 요청한 서버에 바로 전달
    }

}
