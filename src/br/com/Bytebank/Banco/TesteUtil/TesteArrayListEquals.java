package br.com.Bytebank.Banco.TesteUtil;

import br.com.Bytebank.Banco.Especial.ContaEspecial;
import br.com.Bytebank.Banco.Modelo.Conta;
import br.com.Bytebank.Banco.Modelo.ContaCorrente;
import br.com.Bytebank.Banco.Modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.LinkedList;

public class TesteArrayListEquals {

    public static void main(String[] args) {

//        Conta c1 = new ContaCorrente(22,551);
//        Conta c2 = new ContaCorrente(22,551);
//
//        boolean igual = c1.ehIgual(c2);
//        System.out.println(igual);

        LinkedList<Conta> lista = new LinkedList<Conta>();

        Conta cc = new ContaCorrente(22,14);
        lista.add(cc);

        Conta cc2 = new ContaPoupanca(44,5454);
        lista.add(cc2);

        Conta cc3 = new ContaEspecial(44,44);
        lista.add(cc3);
        boolean existe = lista.contains(cc3);

        System.out.println("Já existe? " + existe);

        for(Conta conta: lista){
            if(conta.equals(cc3)){
                System.out.println("Ja tenho essa conta!");
            }
        }

        for (Conta conta : lista){
            System.out.println(conta);
        }
    }
}
