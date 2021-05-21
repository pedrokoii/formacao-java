package br.com.bytebank.banco.test;

public class TesteString {
    
    public static void main(String[] args) {
        
        String aluraEspacos = "     Alura     ";
        String aluraSemEspacos = aluraEspacos.trim();

        System.out.println(aluraEspacos);
        System.out.println(aluraSemEspacos);

        String vazio = "";
        String espaco = " ";

        System.out.println(vazio.isEmpty());
        System.out.println(espaco.isEmpty());

        //String outro = new String("Alura");
        String nome = "Alura"; //object literal
        System.out.println(nome);

        System.out.println(nome.length());
        for(int i=0; i < nome.length(); i++){
            System.out.println(nome.charAt(i));
        }

        System.out.println(nome.substring(1));

        System.out.println(nome.indexOf("ur"));

        char c = nome.charAt(2);
        System.out.println(c);

        char x = 'A';
        char y = 'a';
        System.out.println(nome.replace(x, y));

        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());

    }

}
