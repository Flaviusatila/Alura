package br.com.estacionamento.estacionamentoBecca.repository;

import br.com.estacionamento.estacionamentoBecca.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao , Long> {
}
