import java.util.Scanner;
public class FuncionarioPrincipal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        Pessoa pessoa = new Pessoa();
        pessoa = funcionario;

        System.out.println("Infrome o nome do funcionário: ");
        funcionario.setNome(input.nextLine());
        System.out.println("Informe seu CPF: ");
        funcionario.setCpf(input.nextInt());
        System.out.println("Informe a data de nascimento: ");
        input.nextLine();
        funcionario.setDataNasc(input.nextLine());
        System.out.println("Informe o salário bruto: ");
        funcionario.salarioBruto = input.nextDouble();
        System.out.println("INSS (5%): " + funcionario.salarioBruto * funcionario.inss);
        System.out.println("IR (11%): " + funcionario.salarioBruto * funcionario.ir);
        System.out.println("Salário liquido: " + funcionario);

        System.out.println("-----------");
        funcionario.toString();
        System.out.println();

    }

}
