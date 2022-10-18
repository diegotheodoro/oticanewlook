package br.com.oticanewlook.oticanewlook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.oticanewlook.oticanewlook.model.Funcionario;
import br.com.oticanewlook.oticanewlook.repository.FuncionarioRepository;

@Controller
@RequestMapping
public class LoginController {

    @Autowired
    private FuncionarioRepository funcRepo;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/logar")
    public String logar(Model model, Funcionario funcParam) {
        Funcionario func = this.funcRepo.Login(funcParam.getNome(), funcParam.getSenha());
        if (func != null) {
            return "redirect:/";
        }
        model.addAttribute("erro", "Dados incorretos ou Usuário não existe!");
        return "login";
    }
}
