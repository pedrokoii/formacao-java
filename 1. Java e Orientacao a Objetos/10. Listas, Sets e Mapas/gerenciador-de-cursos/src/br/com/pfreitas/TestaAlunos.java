package br.com.pfreitas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {

    public static void main(String[] args) {

        Collection<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");
        alunos.add("Alberto Souza");

        System.out.println(alunos);

        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
        System.out.println(pauloEstaMatriculado);

        System.out.println(alunos.size());

        for (String aluno : alunos) {
            System.out.println(aluno);
        }
        System.out.println();

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });
        System.out.println();

        List<String> alunosEmLista = new ArrayList<>(alunos);
        alunosEmLista.sort(Comparator.comparing(String::toString));
        System.out.println(alunosEmLista);

    }

}
