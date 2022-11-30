
import java.util.Locale;
import java.util.Scanner;

public class Exer_1015 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // DISTANCIA ENTRE DOIS PONTOS

        double px1, px2, py1, py2, distancia;

        px1 = sc.nextDouble();
        py1 = sc.nextDouble();
        px2 = sc.nextDouble();
        py2 = sc.nextDouble();

        double px = (px2 - px1) * (px2 - px1);

        double py = (py2 - py1) * (py2 - py1);

        distancia = Math.sqrt(px + py);

        System.out.printf("%.4f%n", distancia);

        sc.close();

    }

}

