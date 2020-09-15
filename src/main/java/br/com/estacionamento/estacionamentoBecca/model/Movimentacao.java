package br.com.estacionamento.estacionamentoBecca.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Optional;

@Entity
public class Movimentacao {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Long id_veiculo;


    private Long id_estacionamento;


    private Long id_tipo_veiculo;


    private Double total_valor_estacionado_movimentado;

    private Double hrEstacionamentoCobrado;

    public Double getHrEstacionamentoCobrado() {
        return hrEstacionamentoCobrado;
    }

    public void setHrEstacionamentoCobrado(Double hrEstacionamentoCobrado) {
        this.hrEstacionamentoCobrado = hrEstacionamentoCobrado;
    }

    public Long getId_veiculo() {
        return id_veiculo;
    }

    public void setId_veiculo(Long id_veiculo) {
        this.id_veiculo = id_veiculo;
    }

    public Long getId_estacionamento() {
        return id_estacionamento;
    }

    public void setId_estacionamento(long id_estacionamento) {
        this.id_estacionamento = id_estacionamento;
    }

    public Long getId_tipo_veiculo() {
        return id_tipo_veiculo;
    }

    public void setId_tipo_veiculo(Long id_tipo_veiculo) {
        this.id_tipo_veiculo = id_tipo_veiculo;
    }

    public Double getTotal_valor_estacionado_movimentado() {
        return total_valor_estacionado_movimentado;
    }

    public void setTotal_valor_estacionado_movimentado(Double total_valor_estacionado_movimentado) {
        this.total_valor_estacionado_movimentado = total_valor_estacionado_movimentado;
    }

}
