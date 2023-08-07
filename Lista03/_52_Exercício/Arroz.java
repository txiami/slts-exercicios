package _52_Exercício;

public class Arroz {
    public static void main(String[] args) {

        int casas = 64;
        long totalArroz = 0;
        long grãosNaCasa = 1;

        for (int i = 1; i <= casas; i++) {
            totalArroz += grãosNaCasa;
            grãosNaCasa *= 2;
        }

        System.out.println("O súdito ganharia um total de " + totalArroz + " grãos de arroz.");


        double grãosPorSaco = 64000;
        double quantidadeSacos = totalArroz / grãosPorSaco;

        System.out.println("Isso equivale a aproximadamente " + quantidadeSacos + " sacos de arroz.");
    }
}

