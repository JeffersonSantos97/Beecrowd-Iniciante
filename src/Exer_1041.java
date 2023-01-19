import java.util.Locale;
import java.util.Scanner;

public class Exer_1041 {

    public static void main(String[] args ) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner( System.in );


        double nx = sc.nextDouble();
        double ny = sc.nextDouble();
        // Origem

        if(nx == 0.0 && ny == 0.0) {

            System.out.println("Origem");
        }
        // Eixo X
        else if( nx != 0.0 && ny == 0.0 ) {

            System.out.println("Eixo X");
        }
        // Eixo Y
        else if( nx == 0.0 && ny != 0.0 ) {

            System.out.println("Eixo Y");
        }
        // quadrante 1
        else if(nx > 0.0 && ny > 0.0 ) {

            System.out.println("Q1");
        }
        // quadrante 2
        else if(nx < 0.0 && ny > 0.0) {

            System.out.println("Q2");
        }
        // quadrante 3
        else if(nx < 0.0 && ny < 0.0) {

            System.out.println("Q3");
        }

        // quadrante 4
            else  {

            System.out.println("Q4");
        }







        sc.close();
    }

}
