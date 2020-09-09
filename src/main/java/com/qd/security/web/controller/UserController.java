package com.qd.security.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

   @GetMapping("/login")
    public String login(){
       return "login";
   }

   @GetMapping("/list")
    public String list(){
       System.out.println("查询列表");
       return "list";
   }
}
