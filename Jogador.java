import java.util.Scanner;

public class Jogador {
    String nome;
    double peso, salario;
    int idade, qtdCartoes, qtdGols;

    public String toString() {
        return "nome: " + nome + "\n" +
                "peso: " + peso + "\n" +
                "idade: " + idade + "\n" +
                "Quantidade de carões: " + qtdCartoes + "\n" +
                "Quantidade de gols: " + qtdGols + "\n";
    }
}
