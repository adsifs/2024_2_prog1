package br.ifs.cads.barbearia.model;

import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

public class StatusFuncionario extends AuditModel {
    private String nome;

    @OneToMany (mappedBy = "statusFuncionarioId")
    private List<Funcionario> funcionarios;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
