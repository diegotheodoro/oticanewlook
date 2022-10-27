package br.com.oticanewlook.oticanewlook.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
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
import br.com.oticanewlook.oticanewlook.servico.CookieService;

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
    public String logar(Model model, @Valid Funcionario funcParam, BindingResult result, RedirectAttributes a,
            HttpServletResponse response) throws IOException {
        Funcionario func = this.funcRepo.Login(funcParam.getEmail(), funcParam.getSenha());

        if (func != null) {
            int tempoLogado = (60 * 60);
            CookieService.setCookie(response, "funcionarioID", String.valueOf(func.getId_func()), tempoLogado);
            CookieService.setCookie(response, "funcionarioNome", String.valueOf(func.getNome()), tempoLogado);
            a.addFlashAttribute("msg", "Login realizado!");
            return "redirect:/principal";
        } else if (result.hasErrors()) {

            model.addAttribute("msg", "Dados incorretos!");
        }

        return "home/login";
    }

    @GetMapping("/sair")
    public String logar(HttpServletResponse response) throws IOException {
        CookieService.setCookie(response, "funcionarioID", "", 0);
        CookieService.setCookie(response, "funcionarioNome", "", 0);
        return "redirect:/";
    }

}
