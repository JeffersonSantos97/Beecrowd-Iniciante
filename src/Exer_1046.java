import java.util.Scanner;

public class Exer_1046 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        int n1,n2, resultado;

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        // n1 menor que o n2

        if(n1 < n2 ) {

            resultado = n2 - n1;
        } else if(n1 > n2 ) {

            resultado = (24 - n1) + n2;
        } else {

            resultado = 24;
        }

        System.out.println("O JOGO DUROU " + resultado + " HORA(S)");





        sc.close();




    }

}
