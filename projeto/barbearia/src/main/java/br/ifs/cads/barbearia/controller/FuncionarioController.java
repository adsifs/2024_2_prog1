package br.ifs.cads.barbearia.controller;

import br.ifs.cads.barbearia.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuncionarioController {
    @Autowired
    private FuncionarioRepository funcionarioRepository;
}
