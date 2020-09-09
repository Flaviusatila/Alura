package br.com.estacionamento.estacionamentoBecca.service;

import br.com.estacionamento.estacionamentoBecca.model.Veiculo;

import java.util.List;

public interface VeiculosService {

    List<Veiculo> findAll();
    Veiculo findById(long id);
    Veiculo save(Veiculo veiculo);

}
