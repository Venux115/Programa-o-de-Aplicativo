package exercicio04;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        // var
        Scanner Ler = new Scanner(System.in);
        String nome;
        Double salario, bonus;
        int venda;

        // programa
        System.out.println("Digite o nome do vendedor: ");
        nome = Ler.nextLine();
        System.out.println("Digite o salário fixo: ");
        salario = Ler.nextDouble();
        System.out.println("Digite o total de vendas feitas: ");
        venda = Ler.nextInt();

        bonus = salario + (venda * 0.15);

        System.out.println(nome + " Seu salario bruto " + salario + " Seu salario com bonus " + bonus);
    }
}
    