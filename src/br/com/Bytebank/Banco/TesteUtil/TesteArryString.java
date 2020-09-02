package br.com.Bytebank.Banco.TesteUtil;

import br.com.Bytebank.Banco.Modelo.Cliente;
import br.com.Bytebank.Banco.Modelo.ContaCorrente;
import br.com.Bytebank.Banco.Modelo.ContaPoupanca;


public class TesteArryString {

    public static void main(String[] args) {

        System.out.println("Funcionou!!");

        for (int i=0; i<args.length; i++){
            System.out.println(args[i]);
        }

    }
}
