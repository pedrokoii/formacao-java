package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    
    public static void main(String[] args) {

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);

        int idade = 29;
        Integer idadeRef = Integer.valueOf(idade); //Autoboxing
        System.out.println(idadeRef.doubleValue());
        int valor = idadeRef.intValue(); //Unboxing
        System.out.println(valor);

        String s = "10";
        //Integer numero = Integer.valueOf(s);
        int numero = Integer.parseInt(s);
        System.out.println(numero);

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29); //Autoboxing

    }

}
