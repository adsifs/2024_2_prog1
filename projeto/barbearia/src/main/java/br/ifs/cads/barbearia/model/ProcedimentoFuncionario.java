package br.ifs.cads.barbearia.model;

import jakarta.persistence.*;

@Entity
@Table(name = "procedimento_funcionario", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"procedimento_id", "funcionario_id", "barbearia_id"})
})
public class ProcedimentoFuncionario extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "procedimento_id", nullable = false)
    private Procedimento procedimento;

    @ManyToOne
    @JoinColumn(name = "funcionario_id", nullable = false)
    private Funcionario funcionario;

    @ManyToOne
    @JoinColumn(name = "barbearia_id", nullable = false)
    private Barbearia barbearia;

    @Column(nullable = false)
    private Double valor;

    @Column(nullable = false)
    private Integer duracao;

    @Enumerated(EnumType.STRING)
    private StatusProcedimento status;

    public ProcedimentoFuncionario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Procedimento getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Barbearia getBarbearia() {
        return barbearia;
    }

    public void setBarbearia(Barbearia barbearia) {
        this.barbearia = barbearia;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public StatusProcedimento getStatus() {
        return status;
    }

    public void setStatus(StatusProcedimento status) {
        this.status = status;
    }
}
