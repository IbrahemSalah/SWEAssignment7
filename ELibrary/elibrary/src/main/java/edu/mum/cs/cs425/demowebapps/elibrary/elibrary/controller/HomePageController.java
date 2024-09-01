package edu.mum.cs.cs425.demowebapps.elibrary.elibrary.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {


    @GetMapping("/")
    public String showHome() {
        return "home";  // Looks for home.html in templates
    }

    @GetMapping("/index")
    public String showIndex() {
        return "index";  // Looks for index.html in templates
    }
}
