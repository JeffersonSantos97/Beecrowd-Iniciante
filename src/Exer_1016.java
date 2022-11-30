import java.util.Locale;
import java.util.Scanner;

public class Exer_1016 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        int km = sc.nextInt();

        int distancia = km * 2;

        System.out.printf("%d minutos%n", distancia);



        sc.close();

    }

}

