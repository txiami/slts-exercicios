package Lista03._24_Lista03.src._24_Lista03;
import java.util.Scanner;

public class ValidadeData {
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o dia: ");
        int dia = input.nextInt();
        System.out.print("Digite o mes: ");
        int mes = input.nextInt();
        System.out.print("Digite o ano: ");
        int ano = input.nextInt();
        int[] naobissexto = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ( (ano % 4 != 0) || (ano % 100 != 0)) {
            if ( dia > naobissexto[mes] ) {
                System.out.println("Data Inválida");

            } else {
                System.out.println("Data Válida");
            }


        }
    }
}