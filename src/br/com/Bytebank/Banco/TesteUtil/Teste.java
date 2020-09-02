package br.com.Bytebank.Banco.TesteUtil;

import br.com.Bytebank.Banco.Modelo.Cliente;
import br.com.Bytebank.Banco.Modelo.ContaCorrente;
import br.com.Bytebank.Banco.Modelo.ContaPoupanca;

public class Teste {

    public static void main(String[] args) {

        int[] idades = new int[5];


        for(int i=0; i<idades.length; i++){
            idades[i] = i*i;
        }

        for(int i=0; i<idades.length; i++){
            System.out.println(idades[i]);
        }


//
//        idades[0] = 29;
//        idades[1] = 39;
//        idades[2] = 49;
//        idades[3] = 59;
//        idades[4] = 69;
//
//        int idade4 = idades[4];
//        System.out.println(idade4);
//
//        System.out.println(idades.length);
//        int idade1 = 29;
//        int idade2 = 39;
//        int idade3 = 19;
//        int idade4 = 19;
//        int idade5 = 69;
//        int idade6 = 59;

    }

}
