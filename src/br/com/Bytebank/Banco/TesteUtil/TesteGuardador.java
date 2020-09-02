package br.com.Bytebank.Banco.TesteUtil;

import br.com.Bytebank.Banco.Modelo.Conta;
import br.com.Bytebank.Banco.Modelo.ContaCorrente;
import br.com.Bytebank.Banco.Modelo.ContaPoupanca;
import br.com.Bytebank.Banco.Modelo.GuardadorDeReferencias;

public class TesteGuardador {

    public static void main(String[] args) {

        GuardadorDeReferencias guardador = new GuardadorDeReferencias();

        Conta cc = new ContaCorrente(22, 11);
        guardador.adicionar(cc);

        Conta cc2 = new ContaPoupanca(222, 1111);
        guardador.adicionar(cc2);

        int tamanho = guardador.getQuantidadeElementos();

        System.out.println(tamanho);

        Conta ref  = (Conta)guardador.getRefencia(1);

        System.out.println(ref.toString());
    }

}
