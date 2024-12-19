package br.ifs.cads.barbearia.model;

import jakarta.persistence.Entity;

@Entity
public class AgendamentoItem extends AuditModel {
    private int agendamentoId;
    private int procedimentoProfissionalId;

    public int getAgendamentoId() {return agendamentoId;}
    public void setAgendamentoId(int agendamentoId) {this.agendamentoId = agendamentoId;}
    public int getProcedimentoProfissionalId() {return procedimentoProfissionalId;}
    public void setProcedimentoProfissionalId(int procedimentoProfissionalId) {this.procedimentoProfissionalId = procedimentoProfissionalId;}
}
