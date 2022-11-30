import java.util.Scanner;

public class Exer_1003 {

    public static void main(String[] args) {

        // SOMA SIMPLES

        Scanner sc = new Scanner ( System.in);
        int n1, n2,soma;

        System.out.println("Entre com o primeiro numero: ");
        n1 = sc.nextInt();

        System.out.println("Entre com o segundo numero: ");
        n2 = sc.nextInt();



        soma = n1 + n2 ;

        System.out.println("Soma = " + soma);


        sc.close();

    }

}
