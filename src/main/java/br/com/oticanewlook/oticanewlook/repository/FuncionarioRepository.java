package br.com.oticanewlook.oticanewlook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.oticanewlook.oticanewlook.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
    
}
