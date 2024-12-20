package br.ifs.cads.barbearia.model;

import jakarta.persistence.OneToMany;
import java.util.List;

public class FormaPagamento extends AuditModel{
    @OneToMany(mappedBy="formaPagamento")
    private List<Compra> pagamentoCompra;
    private String nome;

    public List<Compra> getPagamentoCompra() {return pagamentoCompra;}
    public void setPagamentoCompra(List<Compra> compras) {this.pagamentoCompra = compras;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
}
