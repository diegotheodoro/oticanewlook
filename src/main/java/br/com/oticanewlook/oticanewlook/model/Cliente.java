package br.com.oticanewlook.oticanewlook.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cliente")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cliente;

    @NotBlank(message = "Nome é obrigatório, não pode ser nulo")
    @NotEmpty(message = "Nome é obrigatório, não pode ser nulo")
    @NotNull(message = "Nome é obrigatório, não pode ser nulo")
    private String nome;

    @NotBlank(message = "Nome é obrigatório, não pode ser nulo")
    @NotEmpty(message = "Nome é obrigatório, não pode ser nulo")
    @NotNull(message = "Nome é obrigatório, não pode ser nulo")
    private String endereco;

    private String tel;

    @NotBlank(message = "Nome é obrigatório, não pode ser nulo")
    @NotEmpty(message = "Nome é obrigatório, não pode ser nulo")
    @NotNull(message = "Nome é obrigatório, não pode ser nulo")
    private String cel;

    @NotBlank(message = "CPF é obrigatório, não pode ser nulo")
    @NotEmpty(message = "CPF é obrigatório, não pode ser nulo")
    @NotNull(message = "CPF é obrigatório, não pode ser nulo")
    private String cpf;

    private String ativo;

    private Date data_cadastro;
    

    @PrimaryKeyJoinColumn
    @OneToOne(cascade=CascadeType.ALL)
    private Cidade id_cidade;


    public int getId_cliente() {
        return id_cliente;
    }


    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public String getTel() {
        return tel;
    }


    public void setTel(String tel) {
        this.tel = tel;
    }


    public String getCel() {
        return cel;
    }


    public void setCel(String cel) {
        this.cel = cel;
    }


    public String getCpf() {
        return cpf.substring(0,6) + "***-**";
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getAtivo() {
        return ativo;
    }


    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }


    public Date getData_cadastro() {
        return data_cadastro;
    }


    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }


    public Cidade getId_cidade() {
        return id_cidade;
    }


    public void setId_cidade(Cidade id_cidade) {
        this.id_cidade = id_cidade;
    }

    
}
