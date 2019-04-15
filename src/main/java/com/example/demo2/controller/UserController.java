package com.example.demo2.controller;

import com.example.demo2.model.User;
import com.example.demo2.service.UserService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController  {

//    protected static final Logger logger = LoggerFactory.getLogger(UserController.class);
//private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String toPage(Model model) {
        return "userPage";
    }

    @RequestMapping(value = "/getuserinfo",method = RequestMethod.GET)
    public User getUserInfo(){
//        logger.info("fff1");
        log.info("hhhddd");
        return userService.getUserById("T");
    }


}