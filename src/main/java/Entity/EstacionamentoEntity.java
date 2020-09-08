package Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "estacionamento")
public class EstacionamentoEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private double valorHora ;
    private double totalFaturamento;
    private double totalFaturamentoCarro;
    private double totalFaturamentoUtilitario;

    public EstacionamentoEntity() {
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
}
