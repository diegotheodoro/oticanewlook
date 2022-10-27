package br.com.oticanewlook.oticanewlook.controller;


import java.util.List;
import java.util.Optional;

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
    private FuncionarioRepository repoFunc;

    //TELA PRINCIPAL
    @GetMapping("/funcionarios")
    public String funcionarios(Model model) {
        List<Funcionario> funcionarios = (List<Funcionario>) repoFunc.findAll();
        model.addAttribute("funcionarios", funcionarios);

        return "generico/funcionario";
    }

    //PROCESSO NOVO FUNCIONÁRIO
    @GetMapping("/funcionarios/novo")
    public String novo() {

        return "cadastros/novoFunc";
    }
    
    @PostMapping("/funcionarios/criar")
    public String criar(@Valid Funcionario funcionario, BindingResult br) {

        if (br.hasErrors()) {
            ModelAndView modelView = new ModelAndView("/funcionarios/novo");
            Iterable<Funcionario> funcionarios = repoFunc.findAll();
            modelView.addObject("funcionarios", funcionarios);
        }

        repoFunc.save(funcionario);
        return "redirect:/funcionarios";
    }

    //PROCESSO ALTERAÇÃO DE FUNCIONÁRIO
    @GetMapping("/funcionarios/{id_func}")
    public String buscar(@PathVariable int id_func, Model model) {
        Optional<Funcionario> funcionario = repoFunc.findById(id_func);

        try {
            model.addAttribute("funcionario", funcionario.get());
        } catch (Exception e) {
            return "/Editar/editarFunc";
        }
        return "/Editar/editarFunc";
    }
    
    @PostMapping("/funcionarios/{id_func}/atualizar")
    public String atualizar(@PathVariable int id_func, Funcionario funcionario) {

        if (!repoFunc.existsById(id_func)) {
            return "redirect:/funcionarios";
        }
        
        repoFunc.findById(id_func);
        return "redirect:/funcionarios";
    }

    //PROCESSO EXCLUIR FUNCIONARIO
    @GetMapping("/funcionarios/{id_func}/excluir")
    public String excluir(@PathVariable int id_func){
        
        repoFunc.deleteById(id_func);;
        return "redirect:/funcionarios";
    }
}
