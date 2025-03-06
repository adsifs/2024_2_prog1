package br.ifs.cads.barbearia.controller;

import br.ifs.cads.barbearia.model.Barbearia;
import br.ifs.cads.barbearia.repository.BarbeariaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BarbeariaController {
    @Autowired
    private BarbeariaRepository barbeariaRepository;

    // listar 
    @GetMapping("/barbearias")
    public Page<Barbearia> getAllBarbearias(Pageable pageable) {
        return barbeariaRepository.findAll(pageable);
    }

    // adicionar
    @PostMapping("/barbearias")
    public Barbearia createBarbearia(@Valid @RequestBody Barbearia barbearia) {
        return barbeariaRepository.save(barbearia);
    }

    // visualizar
    @GetMapping("/barbearias/{id}")
    public ResponseEntity<Barbearia> getBarbeariaById(@PathVariable Long id) {
        return barbeariaRepository.findById(id)
                .map(barbearia -> ResponseEntity.ok(barbearia))
                .orElse(ResponseEntity.notFound().build());
    }

    // editar
    @PutMapping("/barbearias/{id}")
    public ResponseEntity<Barbearia> updateBarbearia(@PathVariable Long id, @Valid @RequestBody Barbearia barbeariaAtualizada) {
        return barbeariaRepository.findById(id)
                .map(barbearia -> {
                    barbearia.setNome(barbeariaAtualizada.getNome());
                    barbearia.setEndereco(barbeariaAtualizada.getEndereco());
                    Barbearia atualizada = barbeariaRepository.save(barbearia);
                    return ResponseEntity.ok(atualizada);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // remover uma barbearia
    @DeleteMapping("/barbearias/{id}")
    public ResponseEntity<?> deleteBarbearia(@PathVariable Long id) {
        return barbeariaRepository.findById(id)
                .map(barbearia -> {
                    barbeariaRepository.delete(barbearia);
                    return ResponseEntity.ok().build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
