package br.ifs.cads.barbearia.controller;

import br.ifs.cads.barbearia.model.AgendamentoItem;
import br.ifs.cads.barbearia.repository.AgendamentoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgendamentoItemController {
    @Autowired
    public AgendamentoItemRepository agendamentoItemRepository;

    @GetMapping("/agendamentositem")
    public Page<AgendamentoItem> getAllPost(Pageable pageable) {return agendamentoItemRepository.findAll(pageable);}
}
