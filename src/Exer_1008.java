import java.util.Scanner;

public class Exer_1008 {

    public static void main(String[] args) {
        // SALÁRIO

        Scanner sc = new Scanner ( System.in);

        int num, horasTrab;
        double valorHora, salario;

        num = sc.nextInt();
        horasTrab = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = (horasTrab * valorHora);

        System.out.printf("NUMBER = %d%n R$ SALARIO = %.2f",num,salario);



        sc.close();

    }

}

