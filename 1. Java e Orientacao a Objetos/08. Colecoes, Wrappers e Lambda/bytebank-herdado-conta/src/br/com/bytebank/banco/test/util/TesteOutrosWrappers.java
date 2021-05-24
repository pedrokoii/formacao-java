package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
    
    public static void main(String[] args) {
        
        Integer idadeRef = Integer.valueOf(29); //autoboxing
        System.out.println(idadeRef.intValue()); //unboxing

        Double dRef = Double.valueOf(3.2); //autoboxing
        System.out.println(dRef.doubleValue()); //unboxing
        
        Boolean bRef = Boolean.FALSE; //autoboxing
        System.out.println(bRef.booleanValue()); //unboxing

        List<Number> lista = new ArrayList<>();
        lista.add(10); //aceita int
        lista.add(32.6); // aceita double
        lista.add(25.6f); //aceita float
        
    }

}
