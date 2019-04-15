package com.example.demo2.plugin.login;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userLogin {
    @RequestMapping("/login")
    public String userLogin(){

        return "demo-sign";
    }

    @RequestMapping("/login-error")
    public String loginError(){
        return "login-error";
    }

    @RequestMapping("/successful")
    public String successful(){
        return "spring security hello world";
    }

}
