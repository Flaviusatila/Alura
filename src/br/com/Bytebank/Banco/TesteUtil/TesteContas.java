package br.com.Bytebank.Banco.TesteUtil;

import br.com.Bytebank.Banco.Modelo.ContaCorrente;
import br.com.Bytebank.Banco.Modelo.ContaPoupanca;

public class TesteContas {
	public static void main(String[] args) {

//		int a =3;
//		int b = a/0;

//		ContaCorrente outra = null;
//		outra.deposita(200.0);


		ContaCorrente cc = new ContaCorrente(111,222);
		cc.deposita(100.00);
		
		ContaPoupanca cp = new ContaPoupanca(222,222);
		cp.deposita(200.00);
		try {
			cc.transfere(10.00, cp);
		}catch (Exception ex){
			System.out.println("Exeption" + ex.getMessage());
		}
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
	}
}
