package br.com.pfreitas.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String stringParaEscrever = "Pedro Freitas";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
        oos.writeObject(stringParaEscrever);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
        String stringLida = (String) ois.readObject();
        ois.close();
        System.out.println(stringLida);
    }

}
