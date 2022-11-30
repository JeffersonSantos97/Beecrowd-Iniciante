import java.util.Scanner;

public class Exer_1011 {

    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);

        // ESFERA


        int raio;
        double volume;
        raio = sc.nextInt();
        volume = ((4/3.0) * 3.14159 ) * Math.pow(raio, 3) ;


        System.out.printf("VOLUME = %.3f", volume);



        sc.close();

    }

}

