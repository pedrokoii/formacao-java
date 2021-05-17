public class EditorVideo extends Funcionario { // EditorVideo eh um Funcionario, Gerente herda da classe Funcionario

    public double getBonificacao() {
        System.out.println("chamando o método de bonificacao do EDITOR DE VIDEO");
        return 150;
    }
}
