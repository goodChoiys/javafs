package test0721.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/a")
    public String test1(Model model) {
        model.addAttribute("username", "정말로");

        return "Test";
    }

    @GetMapping("/b")
    public String test2(Model model) {
        model.addAttribute("username", "이젠 정말");

        return "Test2";
    }
}
