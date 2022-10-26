package br.com.oticanewlook.oticanewlook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.oticanewlook.oticanewlook.model.Funcionario;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Integer> {
    
    

    @Query(value = "SELECT * FROM funcionario WHERE nome =:nome and senha =:senha", nativeQuery = true)
    public Funcionario Login(String nome, String senha);
}
