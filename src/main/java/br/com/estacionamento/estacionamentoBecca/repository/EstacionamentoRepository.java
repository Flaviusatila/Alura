package br.com.estacionamento.estacionamentoBecca.repository;

import br.com.estacionamento.estacionamentoBecca.model.Estacionamento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EstacionamentoRepository extends JpaRepository<Estacionamento, Long> {

    @Query(value = "SELECT SUM(total_faturamento) " +
            "FROM movimentacao", nativeQuery = true)
    public double totalFaturamento();
    @Query(value = "SELECT SUM(total_faturamento) FROM movimentacao " +
            "WHERE oid_tipo_veiculo = 1", nativeQuery = true)
    public double totalFaturamentoUtilitario();

    @Query(value = "SELECT SUM(total_faturamento) FROM movimentacao " +
            "WHERE oid_tipo_veiculo = 2", nativeQuery = true)
    public double totalFaturamentoCarro();

    @Query(value = "SELECT SUM(total_faturamento) FROM movimentacao" +
            " WHERE oid_tipo_veiculo = 3", nativeQuery = true)
    public double totalFaturamentoMoto();
}
