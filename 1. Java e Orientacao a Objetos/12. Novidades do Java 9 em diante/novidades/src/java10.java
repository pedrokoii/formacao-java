import java.util.ArrayList;
import java.util.List;

public class java10 {
    
    public static void main(String[] args) {
        
        // Inferência de variável
        var nomes = new ArrayList<String>();
        nomes.addAll(List.of("Pedro", "Thais", "Vitor"));
        System.out.println(nomes);

    }

}
