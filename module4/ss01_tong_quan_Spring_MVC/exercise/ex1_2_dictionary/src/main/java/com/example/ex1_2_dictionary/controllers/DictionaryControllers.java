package com.example.ex1_2_dictionary.controllers;

import com.example.ex1_2_dictionary.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryControllers {
    @Autowired
    private DictionaryService dictionaryService;
    @GetMapping()
    public String startDictionary(){
        return "index";
    }
    @GetMapping("/findVnString")
    public String findVnString(@RequestParam String enString, Model model){
        String result = dictionaryService.getVnString(enString);
        model.addAttribute("result",result);
        model.addAttribute("enString",enString);
        return "index";
    }
}
