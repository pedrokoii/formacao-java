// Gerente eh um Funcionario, Gerente herda da classe Funcionario, assina o contrato Autenticavel, eh um Autenticavel
public class Gerente extends Funcionario implements Autenticavel{ 

    private int senha;

    @Override
    public double getBonificacao() {
        System.out.println("chamando o método de bonificacao do GERENTE");
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    @Override
    public boolean autentica(int senha)  {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
    
}
