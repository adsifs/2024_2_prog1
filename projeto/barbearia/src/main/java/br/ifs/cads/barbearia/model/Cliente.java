package br.ifs.cads.barbearia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Cliente extends AuditModel{
    @Column(nullable=false)
    private String nome;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String telefone;
    @ManyToOne
    @JoinColumn(name = "barbeariaId")
    private Barbearia barbeariaFavorita;

    public String getNome(){return nome;}
    public void setNome(String nome){this.nome = nome;}
    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email;}
    public String getTelefone(){return telefone;}
    public void setTelefone(String telefone){this.telefone = telefone;}
    public Barbearia getBarbeariaFavorita() {return barbeariaFavorita;}
    public void setBarbeariaFavorita(Barbearia barbeariaFavorita) {this.barbeariaFavorita = barbeariaFavorita;}
}