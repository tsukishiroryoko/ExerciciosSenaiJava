import java.util.Scanner;

public class TrabalhadorPrincipal {
    static Trabalhador trabalhador = new Trabalhador();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o nome do trabalhador: ");
        trabalhador.nome = input.nextLine();
        System.out.println("Informe a idade do trabalhador: ");
        trabalhador.idade = input.nextInt();
        System.out.println("Informe as horas trabalhadas neste mês: ");
        trabalhador.horasTrabalhadas = input.nextInt();
        aumentoSalario();
        System.out.println("-------------------");
        System.out.println(trabalhador.toString());
        System.out.println("-------------------");
    }

    static String aumentoSalario() {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o salário da empresa: ");
        trabalhador.salario = input.nextDouble();
        System.out.println("Informe o salário atual: ");
        trabalhador.salarioAtual = input.nextDouble();
        if (trabalhador.salarioAtual <= 1500) {
            System.out.println("Você terá um aumento de 5% e receberá " + trabalhador.salarioAtual * 0.05);
            System.out.println("Renda Bruta total: " + trabalhador.salarioAtual * 1.05);
            return "" + trabalhador.salarioAtual * 1.05;
        } else if (trabalhador.salarioAtual > 1500 && trabalhador.salarioAtual <= 2500) {
            System.out.println("Você terá um aumento de 2% e receberá " + trabalhador.salarioAtual * 0.02);
            System.out.println("Renda Bruta total: " + trabalhador.salarioAtual * 1.02);
            return "" + trabalhador.salarioAtual * 1.02;
        }
        return "";
    }
}
