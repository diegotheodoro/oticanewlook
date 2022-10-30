package br.com.oticanewlook.oticanewlook.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.oticanewlook.oticanewlook.model.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{
    
}
