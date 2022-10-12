package br.com.oticanewlook.oticanewlook.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "cidade")
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cidade;

    private String nome;

    @PrimaryKeyJoinColumn
    @OneToOne(cascade=CascadeType.ALL)
    private Estado id_estado;

    public Cidade() {
    }

    public Cidade(Long id_cidade, String nome, Estado id_estado) {
        this.id_cidade = id_cidade;
        this.nome = nome;
        this.id_estado = id_estado;
    }

    public Long getId_cidade() {
        return id_cidade;
    }

    public void setId_cidade(Long id_cidade) {
        this.id_cidade = id_cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getId_estado() {
        return id_estado;
    }

    public void setId_estado(Estado id_estado) {
        this.id_estado = id_estado;
    }

    
}
