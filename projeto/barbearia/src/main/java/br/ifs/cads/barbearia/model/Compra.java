package br.ifs.cads.barbearia.model;

import jakarta.persistence.*;
import org.hibernate.sql.ast.tree.expression.ColumnReference;

import java.util.Date;

@Entity
public class Compra extends AuditModel{
    private Date dataCriacao;
    @JoinColumn(referencedColumnName="formaPagamento")
    private FormaPagamento formaPagamento;

    private StatusCompra statusCompra;
    @ManyToOne
    @JoinColumn(name="clienteId")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name="agendamentoId")
    private Agendamento agendamento;
    @ManyToOne
    @JoinColumn(name="funcionarioId")
    private Funcionario funcionario;

    public Date getDataCriacao() {return dataCriacao;}
    public void setDataCriacao(Date dataCriacao) {this.dataCriacao = dataCriacao;}
    public StatusCompra getStatusCompra() {return statusCompra;}
    public void setStatusCompra(StatusCompra statusCompra) {this.statusCompra = statusCompra;}
    public FormaPagamento getFormaPagamento() {return formaPagamento;}
    public void setFormaPagamento(FormaPagamento formaPagamento) {this.formaPagamento = formaPagamento;}
    public Cliente getCliente() {return cliente;}
    public void setCliente(Cliente cliente) {this.cliente = cliente;}
    public Agendamento getAgendamento() {return agendamento;}
    public void setAgendamento(Agendamento agendamento) {this.agendamento = agendamento;}
    public Funcionario getFuncionario() {return funcionario;}
    public void setFuncionario(Funcionario funcionario) {this.funcionario = funcionario;}
}