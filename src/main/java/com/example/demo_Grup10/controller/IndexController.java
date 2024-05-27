package com.example.demo_Grup10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo_Grup10.model.Persona;

@Controller
@RequestMapping("/home")
public class IndexController{

    @GetMapping("/")
    public String index(){
        return "home2";
    }

    @GetMapping("/index")
    public String index2(){
        return "home";
    }
}