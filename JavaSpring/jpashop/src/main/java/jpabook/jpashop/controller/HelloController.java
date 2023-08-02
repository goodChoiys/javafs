package jpabook.jpashop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

//    @GetMapping ("/")
//    public String hello(){
//        return "index";
//    }


    @GetMapping ("/hi")
    public String hello(Model model){
        model.addAttribute("data","Hello!");
        return "hello";
    }

    @GetMapping ("/hello")
    public String hello2(Model model){
        model.addAttribute("name","홍길동");
        model.addAttribute("data","커피");

        return "hello2";
    }

}
