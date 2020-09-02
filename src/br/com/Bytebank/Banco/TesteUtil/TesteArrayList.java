package br.com.Bytebank.Banco.TesteUtil;

import br.com.Bytebank.Banco.Modelo.Conta;
import br.com.Bytebank.Banco.Modelo.ContaCorrente;
import br.com.Bytebank.Banco.Modelo.ContaPoupanca;

import java.util.ArrayList;

public class TesteArrayList {

    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList();

        ArrayList<String> nomes = new ArrayList<String>();

        Conta cc = new ContaCorrente(2222, 1515115);
        lista.add(cc);

        Conta cc2 = new ContaPoupanca(2332, 1510);
        lista.add(cc2);

        System.out.println(lista.size());

        Conta ref = (Conta) lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);

        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(2222, 1515115);
        lista.add(cc3);

        Conta cc4 = new ContaPoupanca(2332, 1510);
        lista.add(cc4);

        for (int i=0; i <lista.size(); i++){
            System.out.println(lista.get(i));
        }

        System.out.println("------------------");

        for (Object o : lista){
            System.out.println(o);
        }

    }
}
