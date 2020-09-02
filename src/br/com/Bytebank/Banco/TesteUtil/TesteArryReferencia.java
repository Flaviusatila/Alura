package br.com.Bytebank.Banco.TesteUtil;

import br.com.Bytebank.Banco.Modelo.Cliente;
import br.com.Bytebank.Banco.Modelo.ContaCorrente;
import br.com.Bytebank.Banco.Modelo.ContaPoupanca;
import br.com.Bytebank.Banco.Modelo.Conta;


public class TesteArryReferencia {

    public static void main(String[] args) {

        Object[] referencia = new Object[5];
        ContaCorrente   cc1    = new ContaCorrente(222,555);
        ContaPoupanca   cc2    = new ContaPoupanca(225,5775);

        System.out.println(referencia.length);

        referencia[0] = cc1;
        referencia[1] = cc2;

        Cliente ci  = new Cliente();
        referencia[2] = ci;

//        System.out.println(referencia[1].getNumero());

        ContaPoupanca ref = (ContaPoupanca) referencia[1];
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());


    }
}
