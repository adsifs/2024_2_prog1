package br.ifs.cads.barbearia.model;

import jakarta.persistence.OneToMany;

import java.util.List;

public class StatusCompra extends AuditModel{
    @OneToMany(mappedBy="status")
    private List<Compra>  statusCompra;
    private String nome;
    public List<Compra> getStatusCompra() {
        return statusCompra;
    }

    public void setStatusCompra(List<Compra> statusCompra) {this.statusCompra = statusCompra;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
}
