package br.com.estacionamento.estacionamentoBecca.model;

import javax.persistence.*;

@Entity
//@Table(name = "estacionamento", schema="estacionamento")
public class Estacionamento {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long   id;
    private long valorHora ;
    private Long totalFaturamento;
    private Long totalFaturamentoCarro;
    private Long totalFaturamentoUtilitario;
    private Long totalFaturamentoMoto;

    public Estacionamento() {
    }

    public void setTotalFaturamento(Long totalFaturamento) {
        this.totalFaturamento = totalFaturamento;
    }

    public void setTotalFaturamentoCarro(Long totalFaturamentoCarro) {
        this.totalFaturamentoCarro = totalFaturamentoCarro;
    }

    public void setTotalFaturamentoUtilitario(Long totalFaturamentoUtilitario) {
        this.totalFaturamentoUtilitario = totalFaturamentoUtilitario;
    }

    public void setValorHora(Long valorHora) {
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double getTotalFaturamento() {
        return totalFaturamento;
    }

    public double getTotalFaturamentoCarro() {
        return totalFaturamentoCarro;
    }

    public double getTotalFaturamentoUtilitario() {
        return totalFaturamentoUtilitario;
    }

    public double getTotalFaturamentoMoto() {
        return totalFaturamentoMoto;
    }

    public void setTotalFaturamentoMoto(Long totalFaturamentoMoto) {
        this.totalFaturamentoMoto = totalFaturamentoMoto;
    }

    public Long getId() {
        return id;
    }
}
