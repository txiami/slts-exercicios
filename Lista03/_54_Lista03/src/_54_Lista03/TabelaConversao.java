package Lista03._54_Lista03.src._54_Lista03;

import java.util.Scanner;

public class TabelaConversao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("DIGITE O VALOR INICIAL: ");
        double valorInicial = input.nextDouble();

        System.out.print("DIGITE O VALOR FINAL: ");
        double valorFinal = input.nextDouble();

        System.out.print("DIGITE O VALOR DE INCREMENTO: ");
        double valorIncremento = input.nextDouble();

        System.out.println("DIGITE O VALOR DO DOLAR");
        double valorDolar = input.nextDouble();


        System.out.printf("|  REAL |  DOLAR |\n");
        for (double real = valorInicial; real <= valorFinal; real += valorIncremento) {

            System.out.printf("| %.2f | %.2f |\n", real, real / valorDolar);
        }

    }
}
