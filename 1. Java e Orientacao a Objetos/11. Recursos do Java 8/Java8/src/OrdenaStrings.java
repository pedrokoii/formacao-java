import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
// import java.util.function.Function;

public class OrdenaStrings {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();
        palavras.add("alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

        palavras.sort(Comparator.comparing(String::length));
        palavras.forEach(System.out::println);
    }

}