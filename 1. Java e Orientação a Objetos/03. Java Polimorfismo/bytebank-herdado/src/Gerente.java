public class Gerente extends FuncionarioAutenticavel { // Gerente eh um FuncionarioAutenticavel, Gerente herda da classe FuncionarioAutenticavel

    public double getBonificacao() {
        System.out.println("chamando o método de bonificacao do GERENTE");
        return super.getSalario();
    }
}
