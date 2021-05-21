
/**
 * 
 * @author Pedro Freitas
 * @version 1.0
 */

public abstract class Conta {

    @DoublePositivo
    protected double saldo;
    private String titular;
    private int agencia;
    private int numero;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("nao pode valor menor ou igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("nao pode valor menor ou igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }
}
