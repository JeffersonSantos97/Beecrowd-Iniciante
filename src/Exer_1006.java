import java.util.Scanner;

public class Exer_1006 {

    public static void main(String[] args) {

        // MEDIA 2

        double n1,n2,n3, media;

        Scanner sc = new Scanner ( System.in);

        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();

        media = ((n1 * 2) + (n2 * 3) + (n3 * 5) ) / (2 + 3 + 5);

        System.out.printf("MEDIA = %.1f", media);



        sc.close();

    }

}

