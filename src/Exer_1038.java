import java.util.Locale;
import java.util.Scanner;

public class Exer_1038 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner( System.in );




        int codigo = sc.nextInt();
        double valor = 0;
        int quantidade = sc.nextInt();

        switch(codigo) {

            case 1: valor = 4.00;
            break;
            case 2: valor = 4.50;
            break;
            case 3: valor = 5.00;
            break;
            case 4: valor = 2.00;
            break;
            case 5: valor = 1.50;
            break;
        }

        double total = quantidade * valor;

        System.out.println("Total: R$ " + String.format("%.2f", total));






        sc.close();
    }


}
