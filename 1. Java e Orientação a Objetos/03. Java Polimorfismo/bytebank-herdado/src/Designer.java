public class Designer extends Funcionario { // Designer eh um Funcionario, Gerente herda da classe Funcionario

    public double getBonificacao() {
        System.out.println("chamando o método de bonificacao do DESIGNER");
        return 200;
    }
}
