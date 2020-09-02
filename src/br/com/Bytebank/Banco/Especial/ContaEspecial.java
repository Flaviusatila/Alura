package br.com.Bytebank.Banco.Especial;

import br.com.Bytebank.Banco.Modelo.Conta;

public class ContaEspecial extends Conta {

    public ContaEspecial(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {

    }
    @Override
    public String toString() {
        return "Conta Especial " + super.toString();
    }
}
