package br.com.estacionamento.estacionamentoBecca.repository;
import br.com.estacionamento.estacionamentoBecca.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

}
