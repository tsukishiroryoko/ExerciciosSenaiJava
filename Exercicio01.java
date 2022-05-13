import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
public class Exercicio01 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        final var ponto = new Locale("en", "us");
        System.out.println("p = a + b + c/2");
        System.out.println("Informe o valor a");
        int a = input.useLocale(ponto).nextInt();
        System.out.println("Informe o valor b");
        int b = input.useLocale(ponto).nextInt();
        System.out.println("Informe o valor c");
        int c = input.useLocale(ponto).nextInt();
        double p = a + b + c / 2;
        areaTriangulo(a, b, c, p);
    }

    static public double areaTriangulo(int a, int b, int c, double p) {
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Área total do triângulo: " + area);
        return area;
    }
}
