package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/game")
    public String game() {
        return "game";
    }

    @GetMapping("/watermelon")
    public String watermelon() {
        return "watermelon";
    }

    @GetMapping("/stickman")
    public String stickman() {
        return "stickman";
    }

    @GetMapping("/goalkeeper")
    public String goalkeeper() {
        return "goalkeeper";
    }
}
