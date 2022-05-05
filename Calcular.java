public class Calcular {
    double valor01;
    double valor02;
    char operador;

    public double soma (double numero1, double numero2) {
        this.valor01 = numero1;
        this.valor02 = numero2;
        double soma = this.valor01 + this.valor02;
        System.out.println("Valor da soma: " + (int)soma);
        return  soma;
    }
    public double subtracao (double numero1, double numero2) {
        this.valor01 = numero1;
        this.valor02 = numero2;
        double subtracao = this.valor01 - this.valor02;
        System.out.println("Valor da subtração: " + (int)subtracao);
        return  subtracao;
    }
    public double multiplicacao (double numero1, double numero2) {
        this.valor01 = numero1;
        this.valor02 = numero2;
        double multiplicacao = this.valor01 * this.valor02;
        System.out.println("Valor da multiplicação: " + multiplicacao);
        return  multiplicacao;
    }
    public double divisao (double numero1, double numero2) {
        this.valor01 = numero1;
        this.valor02 = numero2;
        double divisao = this.valor01 / this.valor02;
        System.out.println("Valor da divisão: " + divisao);
        return  divisao;
    }

}
