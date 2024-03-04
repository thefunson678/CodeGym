package com.example.ex04_1_mail_account_setting.controllers;

import com.example.ex04_1_mail_account_setting.model.MailSetup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

@Controller
@RequestMapping("/mail")
public class MailSetupControllers {
    private static MailSetup mailSetup = new MailSetup();
    static {
        mailSetup.setLanguages("English");
        mailSetup.setPageSize(25);
        mailSetup.setSpamsFilter(false);
        mailSetup.setSignature("Thor");
    }
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String viewMailSetup(Model model){
        List<String> languagesList = new ArrayList<>();
        languagesList.add("English");
        languagesList.add("Vietnamese");
        languagesList.add("Japanese");
        languagesList.add("Chinese");
        model.addAttribute("mailSetup", mailSetup);
        model.addAttribute("languagesList", languagesList);
        List<Integer> pageSizeList = new ArrayList<>();
        pageSizeList.add(25);
        pageSizeList.add(50);
        pageSizeList.add(100);
        model.addAttribute("pageSizeList",pageSizeList);
        String spamsChecked;
        return "index";
    }
    @PostMapping(value = "/setup")
    public String saveMailSetup(@ModelAttribute("mailSetup") MailSetup temp, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return "index";
        }
        mailSetup.setLanguages(temp.getLanguages());
        mailSetup.setPageSize(temp.getPageSize());
        mailSetup.setSpamsFilter(temp.getSpamsFilter());
        mailSetup.setSignature(temp.getSignature());
        model.addAttribute("mailSetup",mailSetup);
        return "mainAccount";
    }
    @GetMapping(value = "/account")
    public String saveAccountSetup(Model model){
        model.addAttribute("mailSetup",mailSetup);
        return "mainAccount";
    }

}
