package br.com.estacionamento.estacionamentoBecca.model;

import javax.persistence.*;

@Entity
@Table(name = "estacionamento", schema="estacionamento")
public class Estacionamento {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private double valorHora ;
    private double totalFaturamento;
    private double totalFaturamentoCarro;
    private double totalFaturamentoUtilitario;
    private double totalFaturamentoMoto;


    public Estacionamento() {
    }

    public void setValorHora(double valorHora) {
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

    public void setTotalFaturamentoMoto(double totalFaturamentoMoto) {
        this.totalFaturamentoMoto = totalFaturamentoMoto;
    }


}
