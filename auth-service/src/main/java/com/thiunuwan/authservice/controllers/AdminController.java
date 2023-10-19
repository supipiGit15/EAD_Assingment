package com.thiunuwan.authservice.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/admin")
@CrossOrigin("*")
public class AdminController {

    @GetMapping("/")
    public String helloAdminController(){

        return  "admin access level";
    }
}
