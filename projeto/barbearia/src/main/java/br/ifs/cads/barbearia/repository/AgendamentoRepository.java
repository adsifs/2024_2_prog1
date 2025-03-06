package br.ifs.cads.barbearia.repository;

import br.ifs.cads.barbearia.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
    List<Agendamento> findByDataAgendamentoBetween(LocalDateTime start, LocalDateTime end);
}
