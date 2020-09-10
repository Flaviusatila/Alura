package br.com.estacionamento.estacionamentoBecca.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
//@Table(name = "movimentacao", schema="estacionamento")
public class Movimentacao {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @NotNull
    private Long id_veiculo;

    @NotNull
    private Long id_estacionamento;

    @NotNull
    private Long id_tipo_veiculo;

    @NotNull
    private Long total_valor_estacionado_movimentado;


    public Long getId_veiculo() {
        return id_veiculo;
    }

    public void setId_veiculo(Long id_veiculo) {
        this.id_veiculo = id_veiculo;
    }

    public Long getId_estacionamento() {
        return id_estacionamento;
    }

    public void setId_estacionamento(Long id_estacionamento) {
        this.id_estacionamento = id_estacionamento;
    }

    public Long getId_tipo_veiculo() {
        return id_tipo_veiculo;
    }

    public void setId_tipo_veiculo(Long id_tipo_veiculo) {
        this.id_tipo_veiculo = id_tipo_veiculo;
    }

    public Long getTotal_valor_estacionado_movimentado() {
        return total_valor_estacionado_movimentado;
    }

    public void setTotal_valor_estacionado_movimentado(Long total_valor_estacionado_movimentado) {
        this.total_valor_estacionado_movimentado = total_valor_estacionado_movimentado;
    }

}
