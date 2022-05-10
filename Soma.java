import java.util.Scanner;
public class Soma {
    int valor01;
    int valor02;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite dois números para a soma: ");
        Soma soma = new Soma(input.nextInt(), input.nextInt());
        System.out.println(soma);
    }

    public Soma(int valor01, int valor02) {
        this.valor01 = valor01;
        this.valor02 = valor02;
    }
    
    public String toString() {
        return " soma com dois parâmetros: " + (valor01 + valor02) + "\n";
    }
}
