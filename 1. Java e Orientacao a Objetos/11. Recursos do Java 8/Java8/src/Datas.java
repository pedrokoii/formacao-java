import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Datas {
    
    public static void main(String[] args) {
        
        LocalDate hoje = LocalDate.now();
        LocalDate aniversario28 = LocalDate.of(2021, Month.OCTOBER, 26);

        Period periodo = Period.between(hoje, aniversario28);
        System.out.println("Faltam " + periodo.getMonths() + " meses e "+ periodo.getDays()+ " dias para o meu aniversário.");

        LocalDate aniversario29 = aniversario28.plusYears(1);
        System.out.println(aniversario29);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");

        String valorFormatado = aniversario29.format(formatador);
        System.out.println(valorFormatado);

        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MMMM/yyyy hh:mm");

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorComHoras));

        LocalTime aula = LocalTime.of(19, 00);
        System.out.println(aula);

    }

}
