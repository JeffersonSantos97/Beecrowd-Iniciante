import java.util.Scanner;

public class Exer_1017 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // 12km/l

        // tempo gasto ( em hrs)

        // velocidade média

        double tempo, velocidade, distancia;
        double litros;

        tempo = sc.nextDouble();
        velocidade = sc.nextDouble();

        distancia = tempo * velocidade;

        litros = distancia / 12;

        System.out.printf("%.3f", litros);









        sc.close();

    }

}

