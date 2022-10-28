package br.com.oticanewlook.oticanewlook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ProdutosController {
    
    @GetMapping("/produtos")
    public String produto(){
        return "generico/produtos";
    }
}
