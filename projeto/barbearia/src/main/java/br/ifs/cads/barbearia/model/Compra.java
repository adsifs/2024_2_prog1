package br.ifs.cads.barbearia.model;

import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class Compra extends AuditModel{
    private int clienteId;
    private int agendamentoId;
    private Date dataCriacao;
    private int funcionarioId;
    private FormaPagamento formaPagamento;
    private Status status;

    private enum FormaPagamento{Dinheiro, Pix, Debito, Credito, Voucher;}
    private enum Status{Cancelada, Finalizada, Aberta;}
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
    public Status getStatus() {return status;}
    public void setStatus(Status status) {this.status = status;}
}
