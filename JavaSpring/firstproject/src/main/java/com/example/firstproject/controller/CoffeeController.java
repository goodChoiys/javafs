package com.example.firstproject.controller;

import com.example.firstproject.dto.CoffeeForm;
import com.example.firstproject.entity.Coffee;
import com.example.firstproject.repository.CoffeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
public class CoffeeController {
    private final CoffeeRepository coffeeRepository;

    @Autowired
    public CoffeeController(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    @GetMapping("/coffee/articles/cnew")
    public  String newArticleForm(){
        return  "articles/cnew";
    }

    @PostMapping("/coffee/articles/create")
    public  String createCoffeeForm(CoffeeForm form){
        log.info(form.toString());
        Coffee coffee = form.toEntity();
        log.info(coffee.toString());

        Coffee saved = coffeeRepository.save(coffee);
        log.info(saved.toString());
        return "redirect:/coffee/articles/" + saved.getId();
    }


    @GetMapping("/coffee/articles/{id}")
    public String show(@PathVariable Long id, Model model){
        log.info("id= " + id);

        Coffee coffeeEntity = coffeeRepository.findById(id).orElse(null);
        model.addAttribute("article", coffeeEntity);
        return "/articles/show";
    }

    @GetMapping("/coffee/articles")
    public String index(Model model){
        Iterable<Coffee> coffeeIterable = coffeeRepository.findAll();
        List<Coffee> coffeeEntityList = new ArrayList<>();
        for (Coffee coffee : coffeeIterable) {
            coffeeEntityList.add(coffee);
        }
        model.addAttribute("coffeeList", coffeeEntityList);
        return "articles/index";
    }

    @GetMapping("/coffee/articles/{id}/edit")
    public String edit(@PathVariable Long id, Model model){
        Coffee coffeeEntity = coffeeRepository.findById(id).orElse(null);
        model.addAttribute("coffee", coffeeEntity);
        return "/articles/edit";
    }
    @PostMapping("/coffee/articles/update")
    public String update(CoffeeForm form){
        log.info(form.toString());
        Coffee coffeeEntity = form.toEntity();
        log.info(coffeeEntity.toString());
        Coffee target = coffeeRepository.findById(coffeeEntity.getId()).orElse(null);
        if(target != null) {
            coffeeRepository.save(coffeeEntity);
        }
        return "redirect:/coffee/articles/" + coffeeEntity.getId();
    }

    @GetMapping("/coffee/articles/{id}/delete")
    public String delete(@PathVariable Long id, RedirectAttributes rdatb) {
        //리다이렉트후 다른 컨트롤러나 뷰로 데이터를 전달할때 쓰임
        log.info("삭제 요청이 들어왔습니다!!");
        //삭제 대상을 가져옴
        Coffee target = coffeeRepository.findById(id).orElse(null);
        log.info(target.toString());

        //대상을 삭제
        if (target != null) {
            coffeeRepository.delete(target);
            rdatb.addFlashAttribute("alertMessage", "삭제가 완료되었습니다.");
        }

        //결과 페이지로 리다이렉트
        return "redirect:/coffee/articles";

    }
}






