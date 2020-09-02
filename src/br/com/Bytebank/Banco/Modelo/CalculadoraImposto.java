package br.com.Bytebank.Banco.Modelo;

public class CalculadoraImposto {

    private double totalImposto;

    public void registra(Tributavel t) {
       double valor = t.getValorImposto();
       this.totalImposto += valor;
    }

    public double getTotalImposto(){
        return totalImposto;
    }



}
