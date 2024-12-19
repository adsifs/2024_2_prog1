package br.ifs.cads.barbearia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Cargo extends AuditModel{

    private String nome;
    @OneToMany(mappedBy = "cargoId")
    private List<Funcionario> funcionarios;
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
}
