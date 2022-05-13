import java.util.Scanner;
import java.lang.Math;
public class Exercicio03 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int idade1;
        int idade2;
        int idade3;

        System.out.println("Informe a primeira idade: ");
        idade1 = input.nextInt();
        System.out.println("Informe a segunda idade: ");
        idade2 = input.nextInt();
        System.out.println("Informe a terceira idade: ");
        idade3 = input.nextInt();
        maiorIdade(idade1, idade2, idade3);
    }

    static int maiorIdade(int idade01, int idade02, int idade03) {
        int idadeMaior = Math.max(idade01, Math.max(idade02, idade03));
        System.out.println("A maior idade é: " + idadeMaior);
        return idadeMaior;
    }
}
