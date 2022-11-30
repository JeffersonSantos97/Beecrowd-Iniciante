import java.util.Scanner;

public class Exer_1005 {

    public static void main(String[] args) {

        // MEDIA 1

        Scanner sc = new Scanner(System.in);
        double n1, n2, media;
        double peso1 = 3.5, peso2 = 7.5;
        System.out.println("Entre com a primeira nota: ");
        n1 = sc.nextDouble();


        System.out.println("Entre com a segunda nota: ");
        n2 = sc.nextDouble();


        media = ((peso1 * n1) + (peso2 * n2)) / (peso1 + peso2);

        System.out.printf("Media = %.5f%n", media);


        sc.close();

    }

}

