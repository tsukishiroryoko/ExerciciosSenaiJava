public class Funcionario extends Pessoa {

    double salarioBruto;
    double salarioLiquido;
    double inss = 0.05;
    double ir = 0.11;

    @Override
    public String toString() {
        return "salario bruto: " + salarioBruto + "\n";



    }
}
