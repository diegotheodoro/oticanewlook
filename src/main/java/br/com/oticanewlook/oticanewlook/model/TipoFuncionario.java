package br.com.oticanewlook.oticanewlook.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_funcionario")
public class TipoFuncionario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tipo_func;

    private String nome;

    public TipoFuncionario() {
    }

    public TipoFuncionario(Long id_tipo_func, String nome) {
        this.id_tipo_func = id_tipo_func;
        this.nome = nome;
    }

    public Long getId_tipo_func() {
        return id_tipo_func;
    }

    public void setId_tipo_func(Long id_tipo_func) {
        this.id_tipo_func = id_tipo_func;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
