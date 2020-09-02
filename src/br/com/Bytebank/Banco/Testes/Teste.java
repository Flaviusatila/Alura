package br.com.Bytebank.Banco.Testes;

import br.com.Bytebank.Banco.Modelo.Cliente;
import br.com.Bytebank.Banco.Modelo.Conta;
import br.com.Bytebank.Banco.Modelo.ContaCorrente;
import br.com.Bytebank.Banco.Modelo.ContaPoupanca;

public class Teste {

    public static void main(String[] args) {

        System.out.println("x");
        System.out.println(3);
        System.out.println(false);

        ContaCorrente cc = new ContaCorrente(22,33);
        ContaPoupanca cp = new ContaPoupanca(33,22);
        Cliente cliente  = new Cliente();

        System.out.println(cc);
        System.out.println(cp);

        println(cliente);

    }

    static void println(){
    }

    static void println(int a){
    }

    static void println(Object conta){

    }

}
