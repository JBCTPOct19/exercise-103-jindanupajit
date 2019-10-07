package com.jindanupajit.javabootcamp.exercise1031;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
    @RequestMapping("/")
    public String homePage() {
        return "index";
    }
}
