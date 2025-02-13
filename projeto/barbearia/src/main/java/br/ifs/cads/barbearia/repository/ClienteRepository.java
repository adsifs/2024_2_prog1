package br.ifs.cads.barbearia.repository;

import br.ifs.cads.barbearia.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteItemRepository extends JpaRepository<Cliente, Long> {
}
