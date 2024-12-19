package br.ifs.cads.barbearia.model;

import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class Cargo extends AuditModel{

    private String nome;
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
}
