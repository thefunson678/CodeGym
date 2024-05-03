package com.example.ex8_1_register_form.controlles;

import com.example.ex8_1_register_form.models.User;
import com.example.ex8_1_register_form.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.lang.annotation.Retention;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class UserController {
    @Autowired
    private IUserService iUserService;
    @GetMapping("/account")
    public String showList(Model model){
        List<User> userList = iUserService.getAll();
        model.addAttribute("usersList",userList);
        return "/index";
    }
    @GetMapping("/create")
    public String showCreate(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "/create";
    }

    @PostMapping("/create")
    public String saveNew(@Validated @ModelAttribute("user") User user, BindingResult bindingResult,
                           Model model){
        if (bindingResult.hasErrors()){
            List<User> userList = iUserService.getAll();
            model.addAttribute("usersList",userList);
            return "/create";
        }
        Boolean saveOK = iUserService.saveUser(user);
        System.out.println(saveOK);
        List<User> userList = iUserService.getAll();
        model.addAttribute("usersList",userList);
        return "/index";
    }

    @GetMapping("/{code}/update")
    public String showUpdate(@PathVariable(name = "code") Integer code, Model model){
        User user = new User();
        user = iUserService.getByCode(code);
        model.addAttribute("user",user);
        return "/showUpdate";
    }
    @PostMapping("/{code}/update")
    public String saveUpdate(@Validated @ModelAttribute("user") User user, BindingResult bindingResult,
                             Model model) {
        if (bindingResult.hasErrors()) {
            List<User> userList = new ArrayList<>();
            model.addAttribute("usersList", userList);
            return "/showUpdate";
        }
        Boolean saveOK = iUserService.saveUser(user);
        System.out.println(saveOK);
        List<User> userList = iUserService.getAll();
        model.addAttribute("usersList", userList);
        return "/index";
    }

    @PostMapping("/delete")
    public String deleteUser(@ModelAttribute("user") User user, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            return  "/index";
        }
        System.out.println(1);
        List<User> userList = iUserService.getAll();
        model.addAttribute("usersList", userList);
        return "/index";
    }
}
