import java.util.Locale;
import java.util.Scanner;

public class Exer_1044 {

    public static void main(String[]args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner( System.in);



        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if(n1 % n2 == 0 || n2 % n1 == 0) {

            System.out.println("Sao Multiplos");
        } else {

            System.out.println("Nao sao Multiplos");
        }






        sc.close();
    }


}
