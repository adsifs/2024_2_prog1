package br.ifs.cads.barbearia.controller;

import br.ifs.cads.barbearia.model.Agendamento;
import br.ifs.cads.barbearia.model.AgendamentoView;
import br.ifs.cads.barbearia.service.AgendamentoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("agendamento")
public class AgendamentoController {
    @Autowired
    AgendamentoService agendamentoService;

    @GetMapping("/listarAgendamentos")
    public List<AgendamentoView> listar(){return agendamentoService.getallViewAgendamento();}

    @GetMapping("/buscarId/{id}")
    public AgendamentoView getById(@PathVariable Long id){return agendamentoService.viewAgendamentoById(id);}

    //http://localhost:8080/agendamento/buscarPorData/?start=2023-04-01T00:00:00&end=2023-04-30T23:59:59
    @GetMapping("/buscarData/")
    public List<AgendamentoView> listarDate(@RequestParam("start") String start, @RequestParam("end") String end){
        return agendamentoService.getAllViewAgendamentoByDate(start, end);
    }

    @PostMapping("/adicionarAgendamento")
    public Agendamento adicionarAgendamento(@Valid @RequestBody Agendamento agendamento){
        return agendamentoService.createAgendamento(agendamento);
    }

    @DeleteMapping("/deletarAgendamento/{id}")
    public void deletarAgendamento(@PathVariable Long id){
        agendamentoService.deletarAgendamento(id);
    }
}