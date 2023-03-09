import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        int i,idade,peso, mais90,soma;
        double media;
        media =0;
        soma =0;
        Scanner ler = new Scanner(System.in);
        mais90 =0;
        for (i = 1; i <= 5; i++){
            System.out.println("Digite a idade: ");
            idade = ler.nextInt();
            System.out.println("Digite o peso: ");
            peso = ler.nextInt();
            if (peso > 90){
                mais90++;
            }
            soma += idade;


        }
        media = soma / 5;
        System.out.println("Pessoas >= 90kg: " +  mais90);
        System.out.println("Média idade: " + media);
    }
}
