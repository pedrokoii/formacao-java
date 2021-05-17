public class Gerente extends Funcionario { // Gerente eh um Funcionario, Gerente herda da classe Funcionario

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    public double getBonificacao() {
        System.out.println("chamando o método de bonificacao do GERENTE");
        return super.getSalario();
    }
}
