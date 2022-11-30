import java.util.Scanner;

public class Exer_1004 {

    public static void main(String[] args) {
        // PRODUTO SIMPLES

        Scanner sc = new Scanner ( System.in);
        int n1, n2, prod;

        System.out.println("Entre com o primeiro numero: ");
        n1 = sc.nextInt();

        System.out.println("Entre com o segundo numero:  ");
        n2 = sc.nextInt();

        // produto das duas variáveis

        prod = n1 * n2;

        System.out.println("PROD = " + prod);

        sc.close();

    }

}

