package br.com.pfreitas.bytebank;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteBiblioteca {
    
    public static void main(String[] args) {
        
        Conta cc = new ContaCorrente(123, 321);
        cc.deposita(200);

        System.out.println(cc.getSaldo());

    }

}
