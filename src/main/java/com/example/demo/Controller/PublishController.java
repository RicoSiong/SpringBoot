package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PublishController {
        @RequestMapping("/publish")
        public String publish(@RequestParam(value = "rico",defaultValue = "kiel") String rico){
            System.out.println("Rico number one"+rico);
            return "publish";
        }
}
