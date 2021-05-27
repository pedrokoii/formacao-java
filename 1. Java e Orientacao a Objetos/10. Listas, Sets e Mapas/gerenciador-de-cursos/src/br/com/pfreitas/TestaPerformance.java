package br.com.pfreitas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

    public static void main(String[] args) {
        long inicio, fim;
        int nElementos = 50000;

        Collection<Integer> listaNumeros = new ArrayList<Integer>();

        inicio = System.currentTimeMillis();
        for (int i = 1; i <= nElementos; i++) {
            listaNumeros.add(i);
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto adicionando em ArrayList: " + (fim - inicio));

        inicio = System.currentTimeMillis();
        for (Integer numero : listaNumeros) {
            listaNumeros.contains(numero);
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto buscando em ArrayList: " + (fim - inicio));


        System.out.println("----------------------------");

        Collection<Integer> setNumeros = new HashSet<Integer>();
        
        inicio = System.currentTimeMillis();
        for (int i = 1; i <= nElementos; i++) {
            setNumeros.add(i);
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto adicionando em HashSet: " + (fim - inicio));

        inicio = System.currentTimeMillis();
        for (Integer numero : setNumeros) {
            setNumeros.contains(numero);
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto buscando em HashSet: " + (fim - inicio));

    }

}
