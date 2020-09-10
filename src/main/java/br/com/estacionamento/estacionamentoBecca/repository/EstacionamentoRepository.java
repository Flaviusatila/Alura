package br.com.estacionamento.estacionamentoBecca.repository;

import br.com.estacionamento.estacionamentoBecca.model.Estacionamento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EstacionamentoRepository extends JpaRepository<Estacionamento, Long> {
}
