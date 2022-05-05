import java.util.Scanner;
import java.util.Locale;
public class CalcularPrincipal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final var ponto = new Locale("en", "us");
        Calcular calcular = new Calcular();

        System.out.println("Digite um dos operadores abaixo: ");
        System.out.println("+ para somar");
        System.out.println("- para subtrair");
        System.out.println("* para multiplicar");
        System.out.println("/ para dividir");
        calcular.operador = input.next().charAt(0);
        switch (calcular.operador) {
            case '+':
                System.out.println("Digite dois números para calcular a soma: ");
                calcular.soma(input.useLocale(ponto).nextDouble(), input.useLocale(ponto).nextDouble());
                break;
            case '-':
                System.out.println("Digite dois números para calcular a subtração: ");
                calcular.subtracao(input.useLocale(ponto).nextDouble(), input.useLocale(ponto).nextDouble());
                break;
            case '*':
                System.out.println("Digite dois números para calcular a multiplicação: ");
                calcular.multiplicacao(input.useLocale(ponto).nextDouble(), input.useLocale(ponto).nextDouble());
                break;
            case '/':
                System.out.println("Digite dois números para calcular a divisão: ");
                calcular.divisao(input.useLocale(ponto).nextDouble(), input.useLocale(ponto).nextDouble());
                break;
            default:
                System.out.println("Valor Digitado não é valido");
        }
    }
}
