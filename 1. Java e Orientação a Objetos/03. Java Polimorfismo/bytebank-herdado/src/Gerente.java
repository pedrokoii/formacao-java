public class Gerente extends Funcionario { // Gerente eh um FuncionarioAutenticavel, Gerente herda da classe FuncionarioAutenticavel

    public double getBonificacao() {
        System.out.println("chamando o método de bonificacao do GERENTE");
        return super.getSalario();
    }
}
