import java.util.Locale;
import java.util.Scanner;

public class Exer_1040 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner( System.in );

        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();
        float n4 = sc.nextFloat();
        float media = ( ( n1 * 2 ) + ( n2 * 3 ) + ( n3 * 4 ) + ( n4 * 1 ) ) / ( 2 + 3 + 4 + 1 );

        System.out.println("Media: " + String.format("%.1f", media));

        if(media >= 7 ) {

            System.out.println("Aluno aprovado.");
        } else if( media < 5 ) {

            System.out.println("Aluno reprovado.");
        } else if(media >= 5 && media < 7 ) {

            System.out.println("Aluno em exame.");
            float notaExame = sc.nextFloat();

            System.out.println("Nota do exame: " + String.format("%.1f", notaExame));

            float mediaExame = ( media + notaExame ) / 2;

            if(mediaExame >= 5 ) {

                System.out.println("Aluno aprovado.");
            } else {

                System.out.println("Aluno reprovado.");
            }

            System.out.println("Media final: " + String.format("%.1f",mediaExame));
        }







        sc.close();
    }



}
