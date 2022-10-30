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
@Table(name = "ordem_servico")
public class OrdemServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_os;

    @NotBlank(message = "Número O.S é obrigatório, não pode ser nulo")
    @NotEmpty(message = "Número O.S é obrigatório, não pode ser nulo")
    @NotNull(message = "Número O.S é obrigatório, não pode ser nulo")
    private int num_os;

    @NotBlank(message = "Valor Total é obrigatório, não pode ser nulo")
    @NotEmpty(message = "Valor Total é obrigatório, não pode ser nulo")
    @NotNull(message = "Valor Total é obrigatório, não pode ser nulo")
    private double valor_total;

    private String ativo;

    private Date data_cadastro;

    public int getId_os() {
        return id_os;
    }

    public void setId_os(int id_os) {
        this.id_os = id_os;
    }

    public int getNum_os() {
        return num_os;
    }

    public void setNum_os(int num_os) {
        this.num_os = num_os;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
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

    /* -----ANALISAR RELAÇÃO FK 
    
    @PrimaryKeyJoinColumn
    @OneToOne(cascade=CascadeType.ALL)
    private Venda id_venda;
    
    @PrimaryKeyJoinColumn
    @OneToOne(cascade=CascadeType.ALL)
    private Funcionario id_func;
    
    @PrimaryKeyJoinColumn
    @OneToOne(cascade=CascadeType.ALL)
    private Cliente id_cliente;
    
    @PrimaryKeyJoinColumn
    @OneToOne(cascade=CascadeType.ALL)
    private Receita id_receita;
    */

    
}
