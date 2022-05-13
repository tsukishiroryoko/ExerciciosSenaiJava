import java.util.Scanner;
public class Aluno extends Pessoa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.print("Digite o nome do aluno: ");
        pessoa.setNome(input.nextLine());
        System.out.println("Digite o CPF do aluno: ");
        pessoa.setCpf(input.nextInt());
        System.out.println("Digite a idade do Aluno: ");
        pessoa.setIdade(input.nextInt());
        System.out.println("Digite a data de Nascimento do Aluno: ");
        pessoa.setDataNasc(input.nextLine());
        pessoa.setDataNasc(input.nextLine());
        System.out.println("Digite o sexo do Aluno: ");
        pessoa.setSexo(input.next().charAt(0));
        System.out.println("Digite a Cidade de nascimento do aluno: ");
        pessoa.setCidadeNasc(input.nextLine());
        pessoa.setCidadeNasc(input.nextLine());
        System.out.println();
        System.out.println("--------Dados do Aluno------- ");
        System.out.println(pessoa);
    }
    
}
