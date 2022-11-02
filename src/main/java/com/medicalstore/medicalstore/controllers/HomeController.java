package com.medicalstore.medicalstore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.medicalstore.medicalstore.models.Customer;
@Controller
public class HomeController {
    @Autowired
    JdbcTemplate jdbcTemplate;

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
    @PostMapping("/signup")
    public String signup(Customer customer){
        String insert_query ="insert into Customer("
                +"idcustomer, username, c_sex, c_phn_no, c_aadhar_no, c_state, c_street, c_city, c_pincode, c_house_no)"
                + "value"
                + "(?,?,?,?,?,?,?,?,?,?)";

        int rows= jdbcTemplate.update(insert_query, 
                            customer.getidcustomer(),
                            customer.getusername(),
                            customer.getc_sex(),
                            customer.getc_ph_no(),
                            customer.getc_aadhar_no(),
                            customer.getc_state(),
                            customer.getc_street(),
                            customer.getc_city(),
                            customer.getc_pincode(),
                            customer.getc_house_no());

        if(rows ==1) {
            return "success";//create success html page
        }else{
            return "error";//create error html page
        }
    }

    @GetMapping("/forgotpassword/")
    public String forgot_password(){
        return "forgotpassword";
    }

    @GetMapping("/profile/editaddress")
    public String edit_address(){
        return "editaddress";
    }
}

