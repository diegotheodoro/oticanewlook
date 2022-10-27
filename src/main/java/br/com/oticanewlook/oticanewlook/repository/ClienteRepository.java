package br.com.oticanewlook.oticanewlook.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.oticanewlook.oticanewlook.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer>{
    
}
