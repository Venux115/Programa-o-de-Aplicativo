import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        // var
        Double num1, num2, soma;

        System.out.println("Digite um número: ");
        num1 = ler.nextDouble();

        System.out.println("Digite o segundo número: ");
        num2 = ler.nextDouble();

        soma = num1 + num2;

        System.out.println("O resultado é: " + soma);

    }

}
