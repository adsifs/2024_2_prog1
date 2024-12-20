package br.ifs.cads.barbearia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.hibernate.sql.ast.tree.expression.ColumnReference;

import java.util.Date;

@Entity
public class Compra extends AuditModel{
    private int clienteId;
    private int agendamentoId;
    private Date dataCriacao;
    private int funcionarioId;
    @ManyToOne
    @JoinColumn(referencedColumnName="formaPagamento")
    private FormaPagamento formaPagamento;
    @ManyToOne
    @JoinColumn(referencedColumnName="status")
    private StatusCompra statusCompra;

    public int getClienteId() {return clienteId;}
    public void setClienteId(int clienteId) {this.clienteId = clienteId;}
    public int getAgendamentoId() {return agendamentoId;}
    public void setAgendamentoId(int agendamentoId) {this.agendamentoId = agendamentoId;}
    public Date getDataCriacao() {return dataCriacao;}
    public void setDataCriacao(Date dataCriacao) {this.dataCriacao = dataCriacao;}
    public int getFuncionarioId() {return funcionarioId;}
    public void setFuncionarioId(int funcionarioId) {this.funcionarioId = funcionarioId;}
    public FormaPagamento getFormaPagamento() {return formaPagamento;}
    public void setFormaPagamento(FormaPagamento formaPagamento) {this.formaPagamento = formaPagamento;}
    public StatusCompra getStatus() {return statusCompra;}
    public void setStatus(StatusCompra statusCompra) {this.statusCompra = statusCompra;}
}
