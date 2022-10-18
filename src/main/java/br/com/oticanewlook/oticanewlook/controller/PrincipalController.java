package br.com.oticanewlook.oticanewlook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/principal")
public class PrincipalController {

    @GetMapping
    public String principal() {
        return "principal";
    }

}
