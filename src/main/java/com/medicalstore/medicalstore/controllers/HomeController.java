package com.medicalstore.medicalstore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "index";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/profile")
    public String profile(){
        return "profile";
    }
    @GetMapping("/empty_cart")
    public String empty_cart(){
        return "emptycart";
    }
    @GetMapping("/orders")
    public String orders(){
        return "orders";
    }
    @GetMapping("/product_detail")
    public String product_detail(){
        return "productdetail";
    }
    @GetMapping("/signup")
    public String signup(){
        return "signup";
    }
    @GetMapping("/profile/editaddress")
    public String edit_address(){
        return "editaddress";
    }
}

