import java.util.Scanner;

public class Exer_1019 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int tempo = sc.nextInt();

        int hora = tempo / 3600;
        tempo = tempo % 3600;

        int minutos = tempo / 60;

        int segundos = tempo % 60;



        System.out.println(hora + ":" + minutos + ":" + segundos);









        sc.close();
    }


}
