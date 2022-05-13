import java.util.Locale;
import java.util.Scanner;


public class Pessoa {
    private String nome;
    private int cpf;
    private int idade;
    private String dataNasc;
    private char sexo;
    private String cidadeNasc;

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
    public char getSexo() {
        return this.sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public String getCidadeNasc() {
        return this.cidadeNasc;
    }
    public void setCidadeNasc(String cidadeNasc) {
        this.cidadeNasc = cidadeNasc;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\n" +
                "Idade: " + getIdade() + "\n" +
                "Data de Nascimento: " + getDataNasc() + "\n" +
                "Sexo: " + getSexo() + "\n" +
                "Cidade de Nascimento: : " + getCidadeNasc() + "\n";

    }
}
