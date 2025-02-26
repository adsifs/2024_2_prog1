package br.ifs.cads.barbearia.service;

import br.ifs.cads.barbearia.model.Agendamento;
import br.ifs.cads.barbearia.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Service
public class AgendamentoService {
    
    @Autowired
    private AgendamentoRepository agendamentoRepository;

    public List<Agendamento> getAllAgendamentos(){return agendamentoRepository.findAll();}

    public Optional<Agendamento> getAgendamentoById(Long id){return agendamentoRepository.findById(id);}

    public Agendamento saveAgendamento(Agendamento agendamento){return agendamentoRepository.save(agendamento);}

    public void deletarAgendamento(Long id){agendamentoRepository.deleteById(id);}

    public List<Agendamento> getAllAgendamentoByDate(LocalDate data){
        LocalDateTime start=data.atStartOfDay();
        LocalDateTime end=data.atTime(LocalTime.MAX);
        return agendamentoRepository.getAllAgendamentoByDate(start, end);}
}
