package com.example.todo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/subtest")
    public Model TestMethod(Model model){
        model.addAttribute("hello", "hi");
        return model;
    }
}
