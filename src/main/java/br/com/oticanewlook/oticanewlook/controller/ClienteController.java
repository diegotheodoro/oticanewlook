package br.com.oticanewlook.oticanewlook.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.oticanewlook.oticanewlook.model.Cliente;
import br.com.oticanewlook.oticanewlook.repository.ClienteRepository;
@Controller
@RequestMapping
public class ClienteController {

    @Autowired
    private ClienteRepository repoCliente;
    
     //TELA PRINCIPAL
     @GetMapping("/clientes")
     public String cliente(Model model) {
         List<Cliente> clientes = (List<Cliente>) repoCliente.findAll();
         model.addAttribute("clientes", clientes);
         return "generico/cliente";
     }
     
     //PROCESSO NOVO CLIENTE
    @GetMapping("/clientes/novo")
    public String novo() {

        return "cadastros/novoClie";
    }

    @GetMapping("/cliente")
    public String cliente(){
        return "generico/cliente";
    }
}
