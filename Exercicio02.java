import java.util.Scanner;
import java.util.Locale;
public class Exercicio02 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe o sexo F para feminino ou M para masculino: ");
        char sexo = input.next().charAt(0);
        sexo(sexo);
    }
    static char sexo(char sexo) {
        System.out.println("seu sexo: " + sexo);
        if (sexo != 'm' && sexo != 'f') {
            System.out.println("sexo inválido");
            return sexo;
        }
        return sexo;
    }
}
