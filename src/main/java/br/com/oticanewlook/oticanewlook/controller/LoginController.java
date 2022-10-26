package br.com.oticanewlook.oticanewlook.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.oticanewlook.oticanewlook.model.Funcionario;
import br.com.oticanewlook.oticanewlook.repository.FuncionarioRepository;

@Controller
@RequestMapping
public class LoginController {

    @Autowired
    private FuncionarioRepository funcRepo;

    @GetMapping("/")
    public String login() {
        return "home/login";
    }

    @PostMapping("/logar")
    public String logar(Model model, @Valid Funcionario funcParam, BindingResult result, RedirectAttributes a) {
        Funcionario func = this.funcRepo.Login(funcParam.getNome(), funcParam.getSenha());

        if (func != null) {
            a.addFlashAttribute("msg", "Login realizado!");
            return "redirect:/principal";
        }
        else if (result.hasErrors()) {

            model.addAttribute("msg", "Dados incorretos!");
        }

        return "home/login";
    }

}
