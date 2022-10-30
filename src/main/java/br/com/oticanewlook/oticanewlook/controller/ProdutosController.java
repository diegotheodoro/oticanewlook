package br.com.oticanewlook.oticanewlook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.oticanewlook.oticanewlook.model.Produto;
import br.com.oticanewlook.oticanewlook.repository.ProdutoRepository;

@Controller
@RequestMapping
public class ProdutosController {

    @Autowired
    private ProdutoRepository repoProduto;
    
    @GetMapping("/produtos")
    public String produto(Model model) {
        List<Produto> produtos = (List<Produto>) repoProduto.findAll();
        model.addAttribute("produtos", produtos);
        
        return "generico/produtos";
    }
}
