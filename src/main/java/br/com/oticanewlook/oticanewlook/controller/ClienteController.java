package br.com.oticanewlook.oticanewlook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ClienteController {
    
    @GetMapping("/cliente")
    public String cliente(){
        return "generico/cliente";
    }
}
