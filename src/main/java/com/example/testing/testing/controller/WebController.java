package com.example.testing.testing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/home")
    public String home(){
        return "home";
    }

    @RequestMapping(value = "/addmhsform")
    public String addmhsform(){
        return "formaddmhs";
    }

    @RequestMapping(value = "/dataku")
    public String dataku(){
        return "dataku";
    }
}
