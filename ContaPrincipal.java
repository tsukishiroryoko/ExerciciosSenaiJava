import java.util.Scanner;
import java.util.Locale;

public class ContaPrincipal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final var ponto = new Locale("en","us");
        Conta cliente = new Conta();

        System.out.println("------Cadastro Banco do Brasil------");
        System.out.print("Digite o seu nome:");
        cliente.setNome(input.nextLine());
        System.out.print("Digite o número da Conta: ");
        cliente.setNumeroConta(input.nextInt());
        System.out.print("Digite o número da Agência: ");
        cliente.setAgencia(input.nextInt());
        System.out.println("");
        System.out.println(cliente);
        System.out.println();
        System.out.println("Digite uma das opções abaixo: ");
        System.out.println("1 - consultar dados do banco");
        System.out.println("2- depositar dinhero");
        System.out.println("3 - sacar dinheiro");
        System.out.println("4 - encerrar consulta");
        int opcao = input.nextInt();
        switch (opcao) {
            case 1:
                System.out.println(cliente);
                break;
            case 2:
                System.out.print("Informe o valor para depositar: R$");
                cliente.setSaldo(input.useLocale(ponto).nextDouble());
                System.out.println(cliente);
                break;
            case 3:
                System.out.println("Digite o valor para o saque: R$:");
                double saque = input.useLocale(ponto).nextDouble();
                if (saque >= cliente.getSaldo()) {
                    while (saque >= cliente.getSaldo()) {
                        System.out.println("Valor do saque acima do permitido. entre com outro valor: R$");
                        saque = input.nextDouble();
                    }
                    System.out.println(cliente);
                    break;
                }
            case 4:
                System.exit(0);

        }


    }
}
