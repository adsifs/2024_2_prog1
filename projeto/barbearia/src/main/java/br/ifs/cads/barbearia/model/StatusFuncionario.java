package br.ifs.cads.barbearia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

@Entity
public class StatusFuncionario extends AuditModel {
    private String nome;

    @OneToMany (mappedBy = "statusFuncionario")
    private List<Funcionario> funcionarios;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
