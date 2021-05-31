import java.util.ArrayList;
import static java.util.Comparator.comparing;
import java.util.List;

// import java.util.function.Function;

public class OrdenaStrings {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();
        palavras.add("alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

        palavras.sort(comparing(String::length));
        palavras.forEach(System.out::println);
    }

}