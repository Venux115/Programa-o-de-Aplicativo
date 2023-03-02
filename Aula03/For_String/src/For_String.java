public class For_String {
   public static void main(String[] args){
       String nome;
       Integer tam,i;

       nome = "Vinícius";
       tam = nome.length();


       System.out.println(tam);
       System.out.println(nome.charAt(0));
       for ( i = 0; i < tam ; i++){
           System.out.println(nome.charAt(i));
       }
       for (i =0 ; i<=100; i++){
           if (i % 2 == 0){
               System.out.println(i);
           }else{
               System.out.println("impar");
           }
       }
   }
}
