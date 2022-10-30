package br.com.oticanewlook.oticanewlook.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "produto")
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_produto;

    @NotBlank(message = "Nome é obrigatório, não pode ser nulo")
    @NotEmpty(message = "Nome é obrigatório, não pode ser nulo")
    @NotNull(message = "Nome é obrigatório, não pode ser nulo")
    private String nome;

    @NotBlank(message = "Código é obrigatório, não pode ser nulo")
    @NotEmpty(message = "Código é obrigatório, não pode ser nulo")
    @NotNull(message = "Código é obrigatório, não pode ser nulo")
    private int codigo;

    @NotBlank(message = "Descrição é obrigatório, não pode ser nulo")
    @NotEmpty(message = "Descrição é obrigatório, não pode ser nulo")
    @NotNull(message = "Descrição é obrigatório, não pode ser nulo")
    private String descricao;

    @NotBlank(message = "Outros é obrigatório, não pode ser nulo")
    @NotEmpty(message = "Outros é obrigatório, não pode ser nulo")
    @NotNull(message = "Outros é obrigatório, não pode ser nulo")
    private String outros;

    @NotBlank(message = "Preço de custo é obrigatório, não pode ser nulo")
    @NotEmpty(message = "Preço de custo é obrigatório, não pode ser nulo")
    @NotNull(message = "Preço de custo é obrigatório, não pode ser nulo")
    private double preco_custo;

    @NotBlank(message = "Preço de venda é obrigatório, não pode ser nulo")
    @NotEmpty(message = "Preço de venda é obrigatório, não pode ser nulo")
    @NotNull(message = "Preço de venda é obrigatório, não pode ser nulo")
    private double preco_venda;

    @NotBlank(message = "Estoque é obrigatório, não pode ser nulo")
    @NotEmpty(message = "Estoque é obrigatório, não pode ser nulo")
    @NotNull(message = "Estoque é obrigatório, não pode ser nulo")
    private int estoque;

    private String ativo;

    private Date data_cadastro;

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getOutros() {
        return outros;
    }

    public void setOutros(String outros) {
        this.outros = outros;
    }

    public double getPreco_custo() {
        return preco_custo;
    }

    public void setPreco_custo(double preco_custo) {
        this.preco_custo = preco_custo;
    }

    public double getPreco_venda() {
        return preco_venda;
    }

    public void setPreco_venda(double preco_venda) {
        this.preco_venda = preco_venda;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
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

    
}
