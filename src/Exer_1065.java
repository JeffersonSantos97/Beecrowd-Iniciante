import java.util.Scanner;

public class Exer_1065 {

    public static void main(String[]args){

        Scanner sc = new Scanner( System.in);

        int n, pares = 0;

        for(int i = 0 ; i < 5 ; i++ ) {
            n = sc.nextInt();
            if(n % 2 == 0 ) {

                pares++;
            }
        }

        System.out.println(pares + " valores pares");




        sc.close();
    }

}
