package exercicio05;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        //var
        Scanner Ler = new Scanner(System.in);
        String nome;
        Double num1,num2,num3,media;

        //programa
        System.out.println("Digite seu nome: ");
        nome = Ler.nextLine();
        System.out.println("Digite a noma 1: ");
        num1 = Ler.nextDouble();
        System.out.println("Digite a noma 2: ");
        num2 = Ler.nextDouble();
        System.out.println("Digite a noma 3: ");
        num3 = Ler.nextDouble();

        media = (num1+num2+num3) / 3;
        
        System.out.println("A média do aluno " + nome + " é " + media);
    }
    
}
