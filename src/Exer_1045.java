import java.util.Locale;
import java.util.Scanner;

public class Exer_1045 {

    public static void main(String[]args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner( System.in);

        double A, B, C, maior, A2, BC;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        if(B > A ) {

            maior = A;
            A = B;
            B = maior;
        }
        if( C > A ) {

            maior = A;
            A = C;
            C = maior;
        }

        A2 = Math.pow(A,2);
        BC = Math.pow(B,2) + Math.pow(C,2);

        if(A >= (B + C )){

            System.out.println("NAO FORMA TRIANGULO");
        }else {

            if(A2 == BC) {

                System.out.println("TRIANGULO RETANGULO");
            } else if(A2 > BC) {

                System.out.println(" TRIANGULO OBTUSANGULO");
            } else {
                System.out.println(" TRIANGULO ACUTANGULO");
            }

            if( A == B && B == C ) {

                System.out.println("TRIANGULO EQUILÁTERO");
            } else if(A == B || A == C || B == C ){

                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        // A FORMA QUE EU FIZ
        /*

        float A,B,C, max1, max2 = 0 ,max3 = 0;

        A = sc.nextFloat();
        B = sc.nextFloat();
        C = sc.nextFloat();

        max1 = Math.max(A,Math.max(B,C));

        if( max1 == A ) {

            max2 = Math.max(B,C);
            max3 = Math.min(B,C);
        }

        if( max1 == B ) {

            max2 = Math.max(A,C);
            max3 = Math.min(A,C);
        }

        if( max1 == C ) {

            max2 = Math.max(A,B);
            max3 = Math.min(A,B);
        }

       if(max1 >= (max2 + max3)) {

           System.out.println("NAO FORMA TRIANGULO");
       } else {

           if(Math.pow(max1,2) == (Math.pow(max2,2) + Math.pow(max3,2))) {

               System.out.println("TRIANGULO RETANGULO");
           }
           if(Math.pow(max1,2) > (Math.pow(max2,2) + Math.pow(max3,2))) {

               System.out.println("TRIANGULO OBTUSANGULO");
           }
           if(Math.pow(max1,2) < (Math.pow(max2,2) + Math.pow(max3,2))) {

               System.out.println("TRIANGULO ACUTANGULO");
           }

           if(max1 == max2 && max1 == max3 && max3 == max2 ) {

               System.out.println("TRIANGULO EQUILATERO");
           }

           if(max1 == max2 && max1 != max3 || max1 == max3 && max1 != max2 ||   max2 == max1 && max2 != max3 || max2 == max3 && max2 != max1 ||  max3 == max2 && max3 != max1 || max3 == max1 && max3 != max2 ) {

               System.out.println("TRIANGULO ISOSCELES");
           }
       }
*/







        sc.close();
    }


}
