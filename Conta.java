public class Conta {
    private String nome;
    private int numeroConta, agencia;
    private double saldo = 5000;

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumeroConta() {
        return this.numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public int getAgencia() {
        return this.agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        return "---Conta Bancaria---" + "\n" +
                "Nome do cliente: " + getNome() + "\n" +
                "Número da Conta Corrente: " + getNumeroConta() + "\n" +
                "Número da Agência: " + getAgencia() + "\n" +
                "Saldo: R$" + getSaldo() + "\n";
    }
}
