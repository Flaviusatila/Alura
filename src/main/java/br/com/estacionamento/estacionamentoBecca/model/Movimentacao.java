package br.com.estacionamento.estacionamentoBecca.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "movimentacao", schema="estacionamento")
public class Movimentacao {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    @NotNull
    private Integer id_veiculo;

    @NotNull
    private Integer id_estacionamento;

    @NotNull
    private Integer id_tipo_veiculo;

    @NotNull
    private Integer total_valor_estacionado_movimentado;


    public Integer getId_veiculo() {
        return id_veiculo;
    }

    public void setId_veiculo(Integer id_veiculo) {
        this.id_veiculo = id_veiculo;
    }

    public Integer getId_estacionamento() {
        return id_estacionamento;
    }

    public void setId_estacionamento(Integer id_estacionamento) {
        this.id_estacionamento = id_estacionamento;
    }

    public Integer getId_tipo_veiculo() {
        return id_tipo_veiculo;
    }

    public void setId_tipo_veiculo(Integer id_tipo_veiculo) {
        this.id_tipo_veiculo = id_tipo_veiculo;
    }

    public Integer getTotal_valor_estacionado_movimentado() {
        return total_valor_estacionado_movimentado;
    }

    public void setTotal_valor_estacionado_movimentado(Integer total_valor_estacionado_movimentado) {
        this.total_valor_estacionado_movimentado = total_valor_estacionado_movimentado;
    }

}
