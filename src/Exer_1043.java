import java.util.Locale;
import java.util.Scanner;

public class Exer_1043 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner( System.in );

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();


        if(( A + B) > C && (A + C ) > B && (B + C) > A  ) {

            double perimetro = A + B + C;
            System.out.println("Perimetro " + String.format("%.1f", perimetro));
        } else {

            double area = ( (A + B ) * C ) / 2;

            System.out.println("Area " + String.format("%.1f", area));
        }







        sc.close();
    }

}
