package exercicio02;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        // var
        Double num1, num2, soma, subtracao, divisao, multiplicacao;

        System.out.println("Digite um número: ");
        num1 = ler.nextDouble();

        System.out.println("Digite o segundo número: ");
        num2 = ler.nextDouble();

        soma = num1 + num2;
        subtracao = num1 - num2;
        divisao = num1 / num2;
        multiplicacao = num1 * num2;

        System.out.println("O soma é: " + soma);
        System.out.println("O subtração é: " + subtracao);
        System.out.println("O divisão é: " + divisao);
        System.out.println("O multiplicação é: " + multiplicacao);

    }

}
