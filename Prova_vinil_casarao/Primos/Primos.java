public class Primos {
    public static void main(String[] args) {
        int j, i, divisao;
  
        for (j = 2; j <= 100; j++) {
            divisao = 0;
            for (i = 1; i < j; i++){
                if (j % i == 0) {
                divisao = divisao + 1;

            }

            }
            if(divisao < 2 ){
                System.out.println(i);
            }
        }
}
}

        
