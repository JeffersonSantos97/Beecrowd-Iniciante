import java.util.Scanner;

public class Exer_1002 {

    public static void main(String[] args) {

        // Area do circulo

        Scanner sc = new Scanner ( System.in);

        double raio,area;




        System.out.println("Entre com o raio: ");
        raio = sc.nextDouble();

        area = 3.14159 * (raio * raio );

        System.out.printf("A = %.4f", area);


        sc.close();

    }

}

