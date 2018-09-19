package com.greenwin.placedumarche.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(Model model){
        String message = "Hello";
        model.addAttribute("message", message);
        return "index";
    }
}
