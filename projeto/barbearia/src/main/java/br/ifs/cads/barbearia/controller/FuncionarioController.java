package br.ifs.cads.barbearia.controller;

import br.ifs.cads.barbearia.model.Funcionario;
import br.ifs.cads.barbearia.repository.FuncionarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @PostMapping("/addFuncionario")
    public Funcionario addFuncionario(@Valid @RequestBody Funcionario funcionario) {
        funcionario = funcionarioRepository.save(funcionario);
        return funcionario;
    }
}
