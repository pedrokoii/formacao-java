package br.com.bytebank.banco.test;

public class TesteString {
    
    public static void main(String[] args) {
        
        String nome = "Alura"; //object literal
        //String outro = new String("Alura");

        String replace = nome.replace("A", "a");
        String lower = nome.toLowerCase();

        System.out.println(nome);
        System.out.println(replace);
        System.out.println(lower);

    }

}
