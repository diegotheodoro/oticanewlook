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
@Table(name = "funcionario")
public class Funcionario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_func;

    @NotBlank(message = "Nome é obrigatório, não pode ser nulo")
    @NotEmpty(message = "Nome é obrigatório, não pode ser nulo")
    @NotNull(message = "Nome é obrigatório, não pode ser nulo")
    private String nome;

    @NotBlank(message = "Nome é obrigatório, não pode ser nulo")
    @NotEmpty(message = "Nome é obrigatório, não pode ser nulo")
    @NotNull(message = "Nome é obrigatório, não pode ser nulo")
    private String email;

    @NotBlank(message = "Nome é obrigatório, não pode ser nulo")
    @NotEmpty(message = "Nome é obrigatório, não pode ser nulo")
    @NotNull(message = "Nome é obrigatório, não pode ser nulo")
    private String endereco;

    private String tel;

    @NotBlank(message = "Nome é obrigatório, não pode ser nulo")
    @NotEmpty(message = "Nome é obrigatório, não pode ser nulo")
    @NotNull(message = "Nome é obrigatório, não pode ser nulo")
    private String cel;

    @NotBlank(message = "Nome é obrigatório, não pode ser nulo")
    @NotEmpty(message = "Nome é obrigatório, não pode ser nulo")
    @NotNull(message = "Nome é obrigatório, não pode ser nulo")
    private String senha;

    private String ativo;

    private Date data_cadastro;
    

    @PrimaryKeyJoinColumn
    @OneToOne(cascade=CascadeType.ALL)
    private Cidade id_cidade;

    @PrimaryKeyJoinColumn
    @OneToOne(cascade=CascadeType.ALL)
    private TipoFuncionario id_tipo_func;

    public Funcionario() {
    }

    public Funcionario(int id_func, String nome, String endereco, String tel, String cel, String ativo, String senha,
            Date data_cadastro, Cidade id_cidade, TipoFuncionario id_tipo_func) {
        this.id_func = id_func;
        this.nome = nome;
        this.endereco = endereco;
        this.tel = tel;
        this.cel = cel;
        this.ativo = ativo;
        this.senha = senha;
        this.data_cadastro = data_cadastro;
        this.id_cidade = id_cidade;
        this.id_tipo_func = id_tipo_func;
    }

    public int getId_func() {
        return id_func;
    }

    public void setId_func(int id_func) {
        this.id_func = id_func;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public TipoFuncionario getId_tipo_func() {
        return id_tipo_func;
    }

    public void setId_tipo_func(TipoFuncionario id_tipo_func) {
        this.id_tipo_func = id_tipo_func;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
}
