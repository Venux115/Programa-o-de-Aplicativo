package exercicio06;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        // var
        Scanner Ler = new Scanner(System.in);
        int a, b, c;

        // program
        System.out.println("Digite o número A: ");
        a = Ler.nextInt();
        System.out.println("Digite o número B: ");
        b = Ler.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println("TROCA: \n A = " + a + "\n B = " + b);
    }

}
