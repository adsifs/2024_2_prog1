package br.ifs.cads.barbearia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Cargo extends AuditModel{
    @NotNull
    private String nome;
    @OneToMany(mappedBy = "cargoId")
    private List<Funcionario> funcionarios;
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public List<Funcionario> getFuncionarios() {return funcionarios;}
    public void setFuncionarios(List<Funcionario> funcionarios) {this.funcionarios = funcionarios;}
}
