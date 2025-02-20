package br.ifs.cads.barbearia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;

@Entity
public class Funcionario extends AuditModel {
    @NotNull
    private String nome;
    @NotNull
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "barbeariaId", referencedColumnName = "id")
    private Barbearia barbearia;

    @ManyToOne
    @JoinColumn(name = "cargoId", referencedColumnName = "id")
    private Cargo cargo;

    @ManyToOne
    @JoinColumn(name = "statusFuncionarioId", referencedColumnName = "id")
    private StatusFuncionario statusFuncionario;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}