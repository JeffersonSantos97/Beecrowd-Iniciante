import java.util.Scanner;

public class Exer_1009 {

    public static void main(String[] args) {
        // SALÁRIO BÔNUS


        Scanner sc = new Scanner ( System.in);
        String nome = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double totalVendas = sc.nextDouble();

        double totalRecebido = ((totalVendas * 15) / 100) + salarioFixo;

        System.out.printf("TOTAL = %.2f",totalRecebido);






        sc.close();

    }

}

