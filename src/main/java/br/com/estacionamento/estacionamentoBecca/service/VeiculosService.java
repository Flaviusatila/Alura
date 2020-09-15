package br.com.estacionamento.estacionamentoBecca.service;

import br.com.estacionamento.estacionamentoBecca.model.Estacionamento;
import br.com.estacionamento.estacionamentoBecca.model.Veiculo;

import java.util.List;
import java.util.Optional;

public interface VeiculosService {

    List<Veiculo> findAll();
    Optional<Veiculo> findOne(String placa);
    Veiculo findById(long id);
    Veiculo save(Veiculo veiculo);
//    Double totalHoras(Veiculo veiculo, Estacionamento estacionamento);
}
