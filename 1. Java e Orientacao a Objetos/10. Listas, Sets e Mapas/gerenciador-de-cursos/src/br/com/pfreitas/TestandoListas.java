package br.com.pfreitas;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {

        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);
        System.out.println();

        aulas.remove(0);
        System.out.println(aulas);
        System.out.println();

        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }
        System.out.println();

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é " + primeiraAula);
        System.out.println();

        System.out.println(aulas.size());
        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("aula " + (i + 1) + ": " + aulas.get(i));
        }
        System.out.println();

        aulas.forEach(aula -> {
            System.out.println("percorrendo: ");
            System.out.println("\t" + "Aula: " + aula);
        });
        System.out.println();

        aulas.add("Aumentando nosso conhecimento");

        System.out.println("Antes de Ordenar");
        System.out.println("\t" + aulas);
        
        Collections.sort(aulas);

        System.out.println("Depois de Ordenar");
        System.out.println("\t" + aulas);
    }

}
