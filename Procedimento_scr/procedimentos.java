package br.ifs.cads.barbearia.model;

import jakarta.persistence.Entity;

@Entity
public class Procedimentos {
    private int id;
    private int procedimentoId;
    private int funcionarioId;
    private int barbeariaId;
    private double valor;
    private int duracao;
    private StatusProcedimento status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProcedimentoId() {
        return procedimentoId;
    }

    public void setProcedimentoId(int procedimentoId) {
        this.procedimentoId = procedimentoId;
    }

    public int getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(int funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    public int getBarbeariaId() {
        return barbeariaId;
    }

    public void setBarbeariaId(int barbeariaId) {
        this.barbeariaId = barbeariaId;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public StatusProcedimento getStatus() {
        return status;
    }

    public void setStatus(StatusProcedimento status) {
        this.status = status;
    }
}
