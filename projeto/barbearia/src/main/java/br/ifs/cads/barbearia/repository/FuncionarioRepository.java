package br.ifs.cads.barbearia.repository;

import br.ifs.cads.barbearia.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;
import java.util.List;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    List<Funcionario> findByNomeContaining(String nome);

    List<Funcionario> findByCargoId(Funcionario cargo);

    List<Funcionario> findByStatusFuncionario(Funcionario statusFuncionario);

    List<Funcionario> findByBarbeariaId(Funcionario barbearia);
}