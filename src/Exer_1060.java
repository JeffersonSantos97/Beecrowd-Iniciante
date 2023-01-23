import java.util.Scanner;

public class Exer_1060 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);


        double n;
        int positivo = 0;

        for(int i = 0; i < 6 ; i++ ) {
            n = sc.nextDouble();
           if(n > 0 ) {

               positivo++;
           }
        }

        System.out.println(positivo + " valores positivos");






        sc.close();
    }


}
