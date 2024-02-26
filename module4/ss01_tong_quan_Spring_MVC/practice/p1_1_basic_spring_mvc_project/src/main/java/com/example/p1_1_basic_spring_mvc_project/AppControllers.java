package com.example.p1_1_basic_spring_mvc_project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppControllers {
    @GetMapping("/greeting")
    public String greetingController(@RequestParam String name, Model model){
        model.addAttribute("name",name);
        return "index";
    }
}
