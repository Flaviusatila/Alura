package br.com.Bytebank.Banco.Modelo;

public class SaldoInsuficienteExeption extends Exception {

       public SaldoInsuficienteExeption(String msg){
           super(msg);
       }
}
