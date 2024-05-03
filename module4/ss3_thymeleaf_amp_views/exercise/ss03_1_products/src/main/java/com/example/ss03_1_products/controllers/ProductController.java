package com.example.ss03_1_products.controllers;

import com.example.ss03_1_products.model.Product;
import com.example.ss03_1_products.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping("/list")
    public String getList(Model model) {
        List<Product> productList = iProductService.getAllList();
        model.addAttribute("productList",productList);
        return "/index";
    }

    @GetMapping("/create")
    public String showCreate(Model model){
        Integer newId = iProductService.getNewID();
        Product product = new Product();
        product.setId(newId);
        model.addAttribute("product",product);
        return "/create";
    }

    @PostMapping("/create")
    public String saveCreate(@ModelAttribute Product product, Model model){
        iProductService.save(product);
        List<Product> productList = iProductService.getAllList();
        model.addAttribute("productList",productList);
        return "/index";
    }
    @PostMapping("/delete")
    public  String deleteByID(@RequestParam(name = "idCodeDelete") Integer id,Model model, RedirectAttributes redirectAttributes){
        iProductService.deleteByID(id);
        return "redirect:/list";
    }
}
