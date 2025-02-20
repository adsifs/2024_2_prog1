package br.ifs.cads.barbearia.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private LocalDateTime dataAgendamento;

    @Column(nullable = false)
    private LocalDateTime dataCriacao;

    @ManyToOne
    @JoinColumn(name = "funcionarioId")
    private Funcionario funcionario;

    @ManyToOne
    @JoinColumn(name = "clienteId", nullable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "agendamentoId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AgendamentoItem> itens;

    // Construtor padrão (obrigatório para JPA)
    public Agendamento() {
    }

    // Construtor com parâmetros
    public Agendamento(LocalDateTime dataAgendamento, LocalDateTime dataCriacao, Funcionario funcionario, Cliente cliente) {
        this.dataAgendamento = dataAgendamento;
        this.dataCriacao = dataCriacao;
        this.funcionario = funcionario;
        this.cliente = cliente;
    }

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(LocalDateTime dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<AgendamentoItem> getItens() {
        return itens;
    }

    public void setItens(List<AgendamentoItem> itens) {
        this.itens = itens;
    }

    // Método toString para facilitar a visualização
    @Override
    public String toString() {
        return "Agendamento{" +
                "id=" + id +
                ", dataAgendamento=" + dataAgendamento +
                ", dataCriacao=" + dataCriacao +
                ", funcionario=" + funcionario +
                ", cliente=" + cliente +
                '}';
    }
}