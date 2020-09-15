package br.com.estacionamento.estacionamentoBecca.model;

import javax.persistence.*;

@Entity
public class Estacionamento {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long   id;
    private Double valorHora ;
    private Long totalFaturamento;
    private Long totalFaturamentoCarro;
    private Long totalFaturamentoUtilitario;
    private Long totalFaturamentoMoto;


    public Estacionamento() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public Long getTotalFaturamento() {
        return totalFaturamento;
    }

    public Long getTotalFaturamentoCarro() {
        return totalFaturamentoCarro;
    }

    public Long getTotalFaturamentoUtilitario() {
        return totalFaturamentoUtilitario;
    }

    public Long getTotalFaturamentoMoto() {
        return totalFaturamentoMoto;
    }

    public void setTotalFaturamentoMoto(Long totalFaturamentoMoto) {
        this.totalFaturamentoMoto = totalFaturamentoMoto;
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

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

}
