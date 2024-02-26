package com.example.ex1_1_money_exchange.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MoneyExchangeControllers {
    @GetMapping("/")
    public String viewFormExchange( ){
        return "index";
    }
    @GetMapping("/exchange")
    public String beginExchange(@RequestParam String usd,@RequestParam String rate, Model model ){
        Double usdDouble = Double.parseDouble(usd);
        Double rateDouble = Double.parseDouble(rate);
        Double usdToVnd;
        usdToVnd = usdDouble * rateDouble;
        String resultEx = "Kết quả: " + usdToVnd + " (vnđ)";
        model.addAttribute("usdToVnd", resultEx);
        model.addAttribute("usd",usd);
        return "index";
    }

}
