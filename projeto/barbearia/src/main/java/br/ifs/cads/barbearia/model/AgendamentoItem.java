package br.ifs.cads.barbearia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class AgendamentoItem extends AuditModel{
    @ManyToOne
    @JoinColumn(name="agendamentoId", nullable = false)
    private Agendamento agendamentoId;
    @ManyToOne
    @JoinColumn(name="procedimentoProfissionalId", nullable = false)
    private ProcedimentoFuncionario procedimentoProfissionalId;

    public Agendamento getAgendamentoId() {return agendamentoId;}
    public void setAgendamentoId(Agendamento agendamentoId) {this.agendamentoId = agendamentoId;}
    public ProcedimentoFuncionario getProcedimentoProfissionalId() {return procedimentoProfissionalId;}
    public void setProcedimentoProfissionalId(ProcedimentoFuncionario procedimentoProfissionalId) {this.procedimentoProfissionalId = procedimentoProfissionalId;}
}
