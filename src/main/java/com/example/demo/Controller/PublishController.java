package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublishController {
    @RequestMapping("/publish")
    public String publish(){
        System.out.println("Rico number one");
        return "publish";
    }
}
