package br.com.Bytebank.Banco.TesteUtil;

import br.com.Bytebank.Banco.Modelo.CalculadoraImposto;
import br.com.Bytebank.Banco.Modelo.ContaCorrente;
import br.com.Bytebank.Banco.Modelo.SeguroDeVida;

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
