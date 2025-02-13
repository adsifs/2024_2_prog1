package br.ifs.cads.barbearia.controller;

import br.ifs.cads.barbearia.model.Agendamento;
import br.ifs.cads.barbearia.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgendamentoController {
    @Autowired
    private AgendamentoRepository agendamentoRepository;

    @GetMapping("agendamento")
    public Page<Agendamento> getAllPost(Pageable pageable) {return agendamentoRepository.findAll(pageable);}
}