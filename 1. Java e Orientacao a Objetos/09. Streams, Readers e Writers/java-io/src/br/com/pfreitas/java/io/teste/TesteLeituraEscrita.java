package br.com.pfreitas.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteLeituraEscrita {

    public static void main(String[] args) throws IOException {
        
        //Rede
        // Socket socket = new Socket();
        // InputStream iStream = socket.getInputStream();
        // OutputStream oStream = socket.getOutputStream();

        //Console
        // InputStream iStream = System.in;
        // OutputStream oStream = System.out;
        
        //Arquivo
        InputStream iStream = new FileInputStream("lorem.txt");
        OutputStream oStream = new FileOutputStream("saidaEscrita.txt");


        Reader reader = new InputStreamReader(iStream);
        BufferedReader br = new BufferedReader(reader);
        String linha = br.readLine();

        Writer writer = new OutputStreamWriter(oStream);
        BufferedWriter bw = new BufferedWriter(writer);
        while(linha != null && !linha.isEmpty()) {
            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = br.readLine();
        }

        br.close();
        bw.close();
    }
    
}
