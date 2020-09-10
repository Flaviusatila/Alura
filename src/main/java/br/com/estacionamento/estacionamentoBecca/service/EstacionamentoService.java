package br.com.estacionamento.estacionamentoBecca.service;

import br.com.estacionamento.estacionamentoBecca.model.Estacionamento;
import br.com.estacionamento.estacionamentoBecca.model.Veiculo;

import java.util.List;

public interface EstacionamentoService {
    List<Estacionamento> findAll();
    Estacionamento save(Estacionamento estacionamento);
}
