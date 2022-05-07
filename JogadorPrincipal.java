import java.util.Scanner;
import java.util.Locale;

public class JogadorPrincipal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final var ponto = new Locale("en", "us");
        Jogador jogador = new Jogador();

        System.out.println("--------Jogador de futebol--------");
        System.out.println("Digite o nome do jogador: ");
        jogador.nome = input.nextLine();
        System.out.println("Digite o peso do jogador " + jogador.nome + ": ");
        jogador.peso = input.nextDouble();
        System.out.println("Digite a idade: ");
        jogador.idade = input.nextInt();
        System.out.println("Digite a Quantidade de cartões: ");
        jogador.qtdCartoes = input.nextInt();
        System.out.println("Digite a Quantidade de gols na carreira: ");
        jogador.qtdGols = input.nextInt();

        System.out.println(jogador.toString());
        input.close();
    }


}
