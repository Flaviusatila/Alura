package br.com.estacionamento.estacionamentoBecca.service;

import br.com.estacionamento.estacionamentoBecca.model.Movimentacao;
import br.com.estacionamento.estacionamentoBecca.model.Veiculo;

public interface MovimentacaoService {
    Veiculo saidaVeiculo(Veiculo veiculo);
    Movimentacao save(Movimentacao movimentacao);
}
