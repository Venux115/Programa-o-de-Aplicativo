import java.util.Scanner;
public class contrario{
    public static void main(String[] args) {
        String nome,contrario;
        Character letra,esp;
        Integer tam,i;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        nome = ler.nextLine();
        tam = nome.length();
        esp = ' ';
        contrario = "";
        for (i = tam; i > 0; i-- ){
            letra = nome.charAt(i-1);

            if (!(letra == esp)){
                contrario = contrario + letra;
            }

        }
        System.out.println(contrario);
    }
}
