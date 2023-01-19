import java.util.Locale;
import java.util.Scanner;

public class Exer_1042 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner( System.in );
        int A, B, C, min1, min2 = 0, min3 =0;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        min1 = Math.min(A, Math.min(B,C));

        if(min1 == A ) {

            min2 = Math.min(B,C);
            min3 = Math.max(B,C);
        }

        if(min1 == B ) {

            min2 = Math.min(A,C);
            min3 = Math.max(A,C);
         }

        if(min1 == C ) {

            min2 = Math.min(A , B);
            min3 = Math.max(A,B);

        }

        System.out.println(min1);
        System.out.println(min2);
        System.out.println(min3);
        System.out.println();
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);



        // MINHA forma que eu resolvi
        /*
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int meio = 0 ;

        if( n1 > maior ) {
            maior = n1;
        }
        if(n1 < menor ) {

            menor = n1;
        }

        if(n2 > maior) {

            maior = n2;
        }
        if(n2 < menor) {

            menor = n2;
        }

        if(n3 > maior ) {

            maior = n3;
        }
        if(n3 < menor ) {

            menor = n3;
        }

        if ( n1 != maior && n1 != menor ) {

            meio = n1;
        }
        if ( n2 != maior && n2 != menor ) {

            meio = n2;
        }

        if ( n3 != maior && n3 != menor ) {

            meio = n3;
        }

        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);

        System.out.println();

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    */






        sc.close();
    }

}
