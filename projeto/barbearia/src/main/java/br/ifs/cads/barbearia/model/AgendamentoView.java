package br.ifs.cads.barbearia.model;

import java.time.LocalDateTime;

public class AgendamentoView {
    private LocalDateTime dataAgendamento;
    private LocalDateTime dataCriacao;
    private String funcionario;
    private String cliente;

    public LocalDateTime getDataAgendamento() {return dataAgendamento;}
    public void setDataAgendamento(LocalDateTime dataAgendamento) {this.dataAgendamento = dataAgendamento;}
    public LocalDateTime getDataCriacao() {return dataCriacao;}
    public void setDataCriacao(LocalDateTime dataCriacao) {this.dataCriacao = dataCriacao;}
    public String getFuncionario() {return funcionario;}
    public void setFuncionario(String funcionario) {this.funcionario = funcionario;}
    public String getCliente() {return cliente;}
    public void setCliente(String cliente) {this.cliente = cliente;}
}