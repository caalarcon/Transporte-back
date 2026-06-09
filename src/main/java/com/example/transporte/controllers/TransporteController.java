package com.example.transporte.controllers;

import com.example.transporte.entities.Transporte;
import com.example.transporte.repositories.TransporteRepositories;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransporteController {

    private final TransporteRepositories transporteRepositories;

    public TransporteController(TransporteRepositories transporteRepositories){
        this.transporteRepositories = transporteRepositories;
    }

    @PostMapping
    public String criarTransporte(@RequestBody Transporte transporte) {
        Transporte s = new Transporte(transporte.getNome(), transporte.getTipo(), transporte.getCapacidade(), transporte.getValor());
        transporteRepositories.save(s);

        return "criado com sucesso!!";
    }

@PostMapping(value = "teste")
    public Transporte criarTransporte1(@RequestBody Transporte transporte) {
    Transporte s = new Transporte(transporte.getNome(), transporte.getTipo(), transporte.getCapacidade(), transporte.getValor());
    transporteRepositories.save(s);

    return s;
}

    @GetMapping
    public List<Transporte> mostrarTranportes() {
        List<Transporte> listarSelecao = transporteRepositories.findAll();
        return listarSelecao;
    }

    @DeleteMapping(value = "/{id}")
    public String deletarSelecao(@PathVariable long id){
        Transporte transporte = transporteRepositories.findById(id)
                .orElseThrow(() ->
                        new RuntimeException
                                ("Seleção não encontrada"));

        transporteRepositories.deleteById(transporte.getId());
        return "Transporte excluido com sucesso!!";
    }

}
