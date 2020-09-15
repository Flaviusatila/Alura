package br.com.estacionamento.estacionamentoBecca.service;

import br.com.estacionamento.estacionamentoBecca.model.Movimentacao;
import br.com.estacionamento.estacionamentoBecca.model.Veiculo;

public interface MovimentacaoService {
    void saidaVeiculo(Veiculo veiculo, Movimentacao movimentacao);
    Movimentacao save(Movimentacao movimentacao);
    Double pegaHoraCobradaBanco();
    Long pegaIdEstacionamento();
}
