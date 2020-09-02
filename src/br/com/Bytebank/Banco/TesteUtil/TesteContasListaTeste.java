package br.com.Bytebank.Banco.TesteUtil;

import br.com.Bytebank.Banco.Modelo.Conta;
import br.com.Bytebank.Banco.Modelo.ContaCorrente;
import br.com.Bytebank.Banco.Modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteContasListaTeste {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22,33);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(252,5454);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(32,22);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(3232,545798);
        cc4.deposita(222.0);

        List<Conta> lista =  new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        for (Conta conta:lista) {
            System.out.println(conta);
        }
        System.out.println("------------------");
        NumeroComparadorDeContas comparator = new NumeroComparadorDeContas();
        lista.sort(comparator);
        for (Conta conta:lista) {
            System.out.println(conta);
        }
    }

}

class NumeroComparadorDeContas implements Comparator<Conta> {


    @Override
    public int compare(Conta o1, Conta o2) {
        if (o1.getNumero() < o2.getNumero()){
            return -345;
        } if (o1.getNumero() > o2.getNumero()){
            return 1;
        }
        return 0;
    }
}