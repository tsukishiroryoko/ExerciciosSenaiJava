import java.util.Locale;
import java.util.Scanner;


public class Pessoa {
    private String nome;
    private int cpf;
    private int idade;
    private String dataNasc;

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCpf() {
        return this.cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getDataNasc() {
        return this.dataNasc;
    }
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    @Override
    public String toString() {
        return "Nome: " + getNome() + "\n" +
                "Idade: " + getIdade() + "\n" +
                "Data de Nascimento: " + getCpf() + "\n";

    }
}
