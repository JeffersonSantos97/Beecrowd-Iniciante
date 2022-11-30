import java.util.Locale;
import java.util.Scanner;

public class Exer_1012 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        // AREA

        double PI = 3.14159;
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        // TRIANGULO

        double triangulo = (A * C) / 2.00;

        // CIRCULO

        double circulo = PI * Math.pow(C, 2);

        // TRAPÉZIO

        double trapezio = ((A + B) * C) / 2.00;

        // QUADRADO

        double quadrado = B * B;

        // RETANGULO

        double retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f %n ", triangulo);
        System.out.printf("CIRCULO: %.3f %n ", circulo);
        System.out.printf("TRAPEZIO: %.3f %n ", trapezio);
        System.out.printf("QUADRADO: %.3f %n ", quadrado);
        System.out.printf("RETANGULO: %.3f %n ", retangulo);

        sc.close();

    }

}

