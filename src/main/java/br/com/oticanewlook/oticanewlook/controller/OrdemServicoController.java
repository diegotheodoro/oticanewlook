package br.com.oticanewlook.oticanewlook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.oticanewlook.oticanewlook.model.OrdemServico;
import br.com.oticanewlook.oticanewlook.repository.OrdemServicoRepository;

@Controller
@RequestMapping
public class OrdemServicoController {

    @Autowired
    private OrdemServicoRepository repoOS;
    
    @GetMapping("/ordemdeServico")
    public String ordemdeServico(Model model) {
        List<OrdemServico> ordemServicos = (List<OrdemServico>) repoOS.findAll();
        model.addAttribute("ordemServicos", ordemServicos);

        return "generico/ordemdeServico";
    }

}
