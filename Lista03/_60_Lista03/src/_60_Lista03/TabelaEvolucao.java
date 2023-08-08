package Lista03._60_Lista03.src._60_Lista03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TabelaEvolucao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da dívida: ");
        double dividaInicial = input.nextDouble();

        System.out.print("Digite a taxa de correção (% ao mês): ");
        double taxaCorrecao = input.nextDouble() / 100;

        System.out.print("Digite a quantidade de anos: ");
        int quantidadeAnos = input.nextInt();

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Anos\tJan    \tFev    \tMar    \tAbr    " + "\tMai    \tJun    \tJul    \tAgo    \tSet    " + "\tOut    \tNov    \tDez");
        double divida = dividaInicial;

        for (int ano = 2007; ano <= 2007 + quantidadeAnos; ano++) {
            System.out.print(ano + " | ");

            for (int month = 1; month <= 12; month++) {
                System.out.print(decimalFormat.format(divida) + " | ");
                divida *= (1 + taxaCorrecao);
            }

            System.out.println();

        }
    }
}
