package br.com.oticanewlook.oticanewlook.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.oticanewlook.oticanewlook.model.Funcionario;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Integer> {

    @Query(value = "SELECT * FROM funcionario WHERE email =:email and senha =:senha", nativeQuery = true)
    public Funcionario Login(String email, String senha);

    /*@Query(value = "UPDATE funcionario SET nome=?, email=?, tel=?, cel=? where id=?", nativeQuery = true)
    public Funcionario UPD(String nome, String email, String tel, String cel);*/

    
}
