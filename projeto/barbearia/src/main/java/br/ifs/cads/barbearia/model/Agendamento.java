package br.ifs.cads.barbearia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
public class Agendamento extends AuditModel{
    private LocalDateTime dataAgendamento;
    private LocalDateTime dataCriacao;
    @ManyToOne
    @JoinColumn(name="funcionarioId")
    private Funcionario funcionario;
    @NotNull
    @ManyToOne
    @JoinColumn(name="clienteId", nullable = false)
    private Cliente cliente;

    public LocalDateTime getDataAgendamento() {return dataAgendamento;}
    public void setDataAgendamento(LocalDateTime dataAgendamento) {this.dataAgendamento = dataAgendamento;}
    public LocalDateTime getDataCriacao() {return dataCriacao;}
    public void setDataCriacao(LocalDateTime dataCriacao) {this.dataCriacao = dataCriacao;}
    public Funcionario getFuncionario() {return funcionario;}
    public void setFuncionario(Funcionario funcionario) {this.funcionario = funcionario;}
    public Cliente getCliente() {return cliente;}
    public void setCliente(Cliente cliente) {this.cliente = cliente;}
    public String getNomeFuncionario(){return this.funcionario.getNome();}
    public String getNomeCliente(){return this.cliente.getNome();}
}