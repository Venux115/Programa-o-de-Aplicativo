package exercicio03;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
       //var
       Scanner Ler = new Scanner(System.in);
       int distancia,combustivel,consumo;
        
        System.out.println("Digite a distancia percorrida: ");
        distancia = Ler.nextInt();
        System.out.println("Digite o combustivel gasto: ");        
        combustivel = Ler.nextInt();
        consumo = distancia / combustivel;
        System.out.println("Foi rodados: " + consumo + "km/l.");
    }
}
