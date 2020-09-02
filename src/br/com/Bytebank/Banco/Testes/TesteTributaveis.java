package br.com.Bytebank.Banco.Testes;

import br.com.Bytebank.Banco.Modelo.ContaCorrente;
import br.com.Bytebank.Banco.Modelo.SeguroDeVida;
import br.com.Bytebank.Banco.Modelo.CalculadoraImposto;

public class TesteTributaveis {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.0);

        SeguroDeVida segura = new SeguroDeVida();

        CalculadoraImposto calc = new CalculadoraImposto();
        calc.registra(cc);
        calc.registra(segura);

        System.out.println(calc.getTotalImposto());
    }

}
