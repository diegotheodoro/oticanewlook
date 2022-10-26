package br.com.oticanewlook.oticanewlook.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.oticanewlook.oticanewlook.model.Funcionario;
import br.com.oticanewlook.oticanewlook.repository.FuncionarioRepository;

@Controller
@RequestMapping
public class FuncionarioController {
    
    @Autowired
    private FuncionarioRepository repo;

    @GetMapping("/funcionarios")
    public String funcionarios(Model model) {
        List<Funcionario> funcionarios = (List<Funcionario>) repo.findAll();
        model.addAttribute("funcionarios", funcionarios);

        return "generico/funcionario";
    }

    @GetMapping("/funcionarios/novo")
    public String novo() {

        return "cadastros/novoFunc";
    }
    
    @PostMapping("/funcionarios/criar")
    public String criar(@Valid Funcionario funcionario, BindingResult br) {

        if (br.hasErrors()) {
            ModelAndView modelView = new ModelAndView("/funcionarios/novo");
            Iterable<Funcionario> funcionarios = repo.findAll();
            modelView.addObject("funcionarios", funcionarios);
        }

        repo.save(funcionario);
        return "redirect:/funcionarios";
    }
    
    @GetMapping("/funcionarios/{id}/excluir")
    public String excluir(@PathVariable int id){
        
        repo.deleteById(id);;
        return "redirect:/funcionarios";
    }
}
