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
@Table(name = "fornecedor")
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_forne;

    @NotBlank(message = "Nome é obrigatório, não pode ser nulo")
    @NotEmpty(message = "Nome é obrigatório, não pode ser nulo")
    @NotNull(message = "Nome é obrigatório, não pode ser nulo")
    private String nome;

    private String tel;

    @NotBlank(message = "Nome é obrigatório, não pode ser nulo")
    @NotEmpty(message = "Nome é obrigatório, não pode ser nulo")
    @NotNull(message = "Nome é obrigatório, não pode ser nulo")
    private String cel;

    @NotBlank(message = "CNPJ é obrigatório, não pode ser nulo")
    @NotEmpty(message = "CNPJ é obrigatório, não pode ser nulo")
    @NotNull(message = "CNPJ é obrigatório, não pode ser nulo")
    private String cnpj;

    private String ativo;

    private Date data_cadastro;

    @PrimaryKeyJoinColumn
    @OneToOne(cascade = CascadeType.ALL)
    private Cidade id_cidade;

    public int getId_forne() {
        return id_forne;
    }

    public void setId_forne(int id_forne) {
        this.id_forne = id_forne;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
