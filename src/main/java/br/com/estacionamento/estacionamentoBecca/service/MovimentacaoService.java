package br.com.estacionamento.estacionamentoBecca.service;

import br.com.estacionamento.estacionamentoBecca.model.Movimentacao;
import br.com.estacionamento.estacionamentoBecca.model.Veiculo;

import java.time.LocalDateTime;

public interface MovimentacaoService {
    Veiculo saidaVeiculo(Veiculo veiculo);
    Movimentacao save(Movimentacao movimentacao);

//    public int getHoraEntrada(LocalDateTime horaEntrada) {
//        return horaEntrada.getHour();
//    }
}
