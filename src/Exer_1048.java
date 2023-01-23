import java.util.Locale;
import java.util.Scanner;

public class Exer_1048 {

    public static void main(String[]args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner( System.in );

        double sal = sc.nextDouble();
        double salReajust = 0.0;
        int perc = 0;

        if(sal > 0.0 && sal <= 400.0 ) {

            salReajust = (sal * 15.0 ) / 100.0;
            sal += salReajust;
            perc = 15;
        } else if(sal > 400.0 && sal <= 800.0 ) {

            salReajust = (sal * 12.0 ) / 100.0;
            sal += salReajust;
            perc = 12;
        } else if(sal > 800.0 && sal <= 1200.0) {

            salReajust = (sal * 10.0 ) / 100.0;
            sal += salReajust;
            perc = 10;
        } else if(sal > 1200.0 && sal <= 2000.0 ) {

            salReajust = (sal * 7.0 ) / 100.0;
            sal += salReajust;
            perc = 7;
        } else {

            salReajust = (sal * 4.0 ) / 100.0;
            sal += salReajust;
            perc = 4;
        }

        System.out.println("Novo salario: " + String.format("%.2f",sal));
        System.out.println("Reajuste ganho: " + String.format("%.2f",salReajust));
        System.out.println("Em percentual: " + perc + " %");








        sc.close();
    }

}
