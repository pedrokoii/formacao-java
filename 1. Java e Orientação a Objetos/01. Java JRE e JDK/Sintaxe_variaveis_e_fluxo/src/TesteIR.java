public class TesteIR {
    public static void main(String[] args) {
        double salario = 3300.0;
        double aliquota = 0;
        double valorDeducao = 0;

        if (salario >= 1900.0 && salario <=2800){
            aliquota = 7.5;
            valorDeducao = 142.00; 
        } else if (salario > 2800.0 && salario <=3751.0){
            aliquota = 15.0;
            valorDeducao = 350.00; 
        } else if (salario > 3751.0 && salario <=4664.0){
            aliquota = 22.5;
            valorDeducao = 636.00; 
        }

        System.out.printf("O valor da sua alíquota é de %.1f%% e você pode deduzir R$ %.2f na declaração.", aliquota, valorDeducao);
    }
}
