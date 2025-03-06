package br.ifs.cads.barbearia.service;

import br.ifs.cads.barbearia.model.Agendamento;
import br.ifs.cads.barbearia.model.Cliente;
import br.ifs.cads.barbearia.model.Funcionario;
import br.ifs.cads.barbearia.model.AgendamentoView;
import br.ifs.cads.barbearia.repository.AgendamentoRepository;
import br.ifs.cads.barbearia.repository.ClienteRepository;
import br.ifs.cads.barbearia.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepository agendamentoRepository;
    @Autowired
    private FuncionarioRepository funcionarioRepository;
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Agendamento> getAllAgendamentos(){return agendamentoRepository.findAll();}
    public Optional<Agendamento> getAgendamentoById(Long id){return agendamentoRepository.findById(id);}
    public Agendamento save(Agendamento agendamento){return agendamentoRepository.save(agendamento);}
    public void deletarAgendamento(Long id){agendamentoRepository.deleteById(id);}
    private List<Agendamento> getAllByDate(LocalDateTime start, LocalDateTime end){return agendamentoRepository.findByDataAgendamentoBetween(start, end);}


    public AgendamentoView agendamentoToViewAgendamento(Agendamento agendamento){
        AgendamentoView viewAgendamento=new AgendamentoView();
        viewAgendamento.setDataAgendamento(agendamento.getDataAgendamento());
        viewAgendamento.setDataCriacao(agendamento.getDataCriacao());
        viewAgendamento.setFuncionario(agendamento.getNomeFuncionario());
        viewAgendamento.setCliente(agendamento.getNomeCliente());
        return viewAgendamento;
    }
    public List<AgendamentoView> getallViewAgendamento(){
        List<AgendamentoView> viewAgendamentoList=new ArrayList<>();
        for (Agendamento agendamento : agendamentoRepository.findAll()){
            viewAgendamentoList.add(agendamentoToViewAgendamento(agendamento));
        }
        try {
            return viewAgendamentoList;
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Não foi possível exibir os agendamentos", e);
        }
    }

    public AgendamentoView viewAgendamentoById (long id){return agendamentoToViewAgendamento(getAgendamentoById(id).get());}

    public List<AgendamentoView> getAllViewAgendamentoByDate(String start, String end){
        List<AgendamentoView> viewAgendamentoList=new ArrayList<AgendamentoView>();
        LocalDateTime startB=LocalDateTime.parse(start);
        LocalDateTime endB=LocalDateTime.parse(end);
        for( Agendamento agendamento : agendamentoRepository.findByDataAgendamentoBetween(startB, endB)){
            viewAgendamentoList.add(agendamentoToViewAgendamento(agendamento));
        }
        try {
            return viewAgendamentoList;
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Data inválida ou inexistente", e);
        }
    }

    public Agendamento createAgendamento(Agendamento agendamento){
        Optional<Cliente> cliente=clienteRepository.findById(agendamento.getCliente().getId());
        Optional<Funcionario> funcionario=funcionarioRepository.findById(agendamento.getFuncionario().getId());
        if (cliente.isEmpty()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "cliente não encontrado");
        }
        if (funcionario.isEmpty()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "funcionario não encontrado");
        }
        try {
            return save(agendamento);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Erro ao salvar agendamento",e);
        }
    }

}