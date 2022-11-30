import java.util.Scanner;

public class Exer_1010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);

        // CALCULO SIMPLES



        int peca1, peca2, numeroPeca1, numeroPeca2;

        double valorPeca1, valorPeca2, totalPagar;

        peca1 = sc.nextInt();
        numeroPeca1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();
        peca2 = sc.nextInt();
        numeroPeca2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();

        totalPagar = (numeroPeca1 * valorPeca1 ) + (numeroPeca2 * valorPeca2 );

        System.out.printf("VALOR A PAGAR:  %.2f", totalPagar);

        sc.close();

    }

}

