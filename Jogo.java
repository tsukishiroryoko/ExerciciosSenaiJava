import java.util.Scanner;

public class Jogo {
    String timeDaCasa, timeVisitante;
    int placarPrimeiroTempo, placarSegundoTempo;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Jogo jogo = new Jogo();
        System.out.println("Informe o time de casa: ");
        jogo.timeDaCasa = input.nextLine();
        System.out.println("Informe o time Visitante: ");
        jogo.timeVisitante = input.nextLine();
        jogo.placarFinal();
    }

    public void placarFinal() {
        Scanner input = new Scanner(System.in);
        toString();
        System.out.println();
        System.out.println("Informe o placar do primeiro tempo");
        this.placarPrimeiroTempo = input.nextInt();
        System.out.println("informe o placar do segundo tempo: ");
        this.placarSegundoTempo = input.nextInt();
        double placarFinal = this.placarPrimeiroTempo + this.placarSegundoTempo;
        System.out.println("Placar final: " + placarFinal);
    }

    public String toString() {
        return "Time de casa: " + timeDaCasa + "\n" +
                "Time de visitante: " + timeVisitante + "\n";
    }
}
