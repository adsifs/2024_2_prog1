package br.ifs.cads.barbearia.repository;

import br.ifs.cads.barbearia.model.AgendamentoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoItemRepository extends JpaRepository<AgendamentoItem, Long> {
}
