package br.com.pfreitas.java.io.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacaoCliente {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Cliente cliente = new Cliente();
        // cliente.setNome("Pedro");
        // cliente.setProfissao("Dev");
        // cliente.setCpf("12345678900");

        // ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        // oos.writeObject(cliente);
        // oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente clienteLido = (Cliente) ois.readObject();
        ois.close();
        System.out.println(clienteLido.getNome());
    }

}
