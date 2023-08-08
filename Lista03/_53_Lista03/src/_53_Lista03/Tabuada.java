package _53_Lista03;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        System.out.print("DIGITE O NUMERO NO QUAL VOCE QUER SABER A TABUADA ATÉ O 10: ");
        int numero = input.nextInt();

        while (i <= 10) {
            System.out.printf("%d x %d = %d \n", numero, i, (numero * i));
            i++;
        }
    }
}
