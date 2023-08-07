package _63_Exercício;

import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        int linha = 01, coluna = 01, totallinhas;
        System.out.println("Determina a quantidade de linhas:");
        totallinhas = new Scanner(System.in).nextInt();
        while (linha <= totallinhas) {
            while (coluna < linha){
                System.out.printf(" %02d", coluna);
                coluna = coluna + 01;
            }
            System.out.printf(" %02d\n", coluna);
            linha = linha + 01;
            coluna = 01;
        }
    }
}
