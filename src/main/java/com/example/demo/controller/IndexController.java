package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        System.out.println("11");
        return "index";
    }

    @GetMapping("/index01")
    public String index01(Model model) {
        model.addAttribute("mes","hh");
        System.out.println("12");
        return "index01";
    }

//    public String login(Model model) {
//        model.addAttribute("projectName", "MOXI");
//        System.out.println("11");
//        return "login";
//    }

}
