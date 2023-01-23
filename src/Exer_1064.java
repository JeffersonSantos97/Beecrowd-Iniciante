import java.util.Locale;
import java.util.Scanner;

public class Exer_1064 {

    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float n;
        float somaPositivo = 0 ;
        int positivos = 0;

            for(int i = 0 ; i < 6 ; i++ ) {

                n = sc.nextFloat();

                if(n > 0.0 ) {
                    somaPositivo += n;
                    positivos++;
                }

            }

        float media = somaPositivo / positivos;

        System.out.println(positivos + " valores positivos");
        System.out.println(String.format("%.1f",media));




        sc.close();
    }



}
