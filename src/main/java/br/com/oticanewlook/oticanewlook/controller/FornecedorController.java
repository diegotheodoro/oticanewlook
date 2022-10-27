package br.com.oticanewlook.oticanewlook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.oticanewlook.oticanewlook.model.Fornecedor;
import br.com.oticanewlook.oticanewlook.repository.FornecedorRepository;

@Controller
@RequestMapping
public class FornecedorController {
    
    @Autowired
    private FornecedorRepository repoFornecedor;

     //TELA PRINCIPAL
     @GetMapping("/fornecedores")
     public String cliente(Model model) {
         List<Fornecedor> fornecedores = (List<Fornecedor>) repoFornecedor.findAll();
         model.addAttribute("fornecedores", fornecedores);
         return "generico/fornecedor";
     }
     
     //PROCESSO NOVO FORNECEDOR
    @GetMapping("/fornecedores/novo")
    public String novo() {

        return "cadastros/novoForn";
    }
}
