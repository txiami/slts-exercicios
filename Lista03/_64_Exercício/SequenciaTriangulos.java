package _64_Exercício;

import java.util.Scanner;

public class SequenciaTriangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de triângulos: ");
        int quantidadeTriangulos = scanner.nextInt();

        for (int i = 0; i < quantidadeTriangulos; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();


            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
