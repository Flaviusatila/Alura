package br.com.Bytebank.Banco.TesteUtil;

import java.util.ArrayList;
import java.util.List;

public class TesteListas {

    public static void main(String[] args) {

//        int[] idades = new int[5];
//        String[] nomes = new String[5];

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);

        int idade = 29;

        Integer idadeRef = Integer.valueOf(29);//Autoboxing
        int valor = idadeRef.intValue();//Unboxing

        Boolean bREf = Boolean.FALSE;
        System.out.println(bREf.booleanValue());

        Number refNumero = Float.valueOf(29.9f);

        List<Number> lista = new ArrayList<>();
        lista.add(21);
        lista.add(55.55);
        lista.add(54.4f);

        System.out.println(idadeRef.doubleValue());

        String s = args[0];

//        Integer numero = Integer.valueOf(s);
        int numero = Integer.parseInt(s);
        System.out.println(numero);

        List numeros = new ArrayList();
        numeros.add(idade);


    }
}
