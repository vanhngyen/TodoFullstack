package com.example.springrest.fullstack.todo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {
    @GetMapping("/")
    public String List(){
        return "todo";
    }
}
