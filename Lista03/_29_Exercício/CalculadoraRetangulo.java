package _29_Exercício;

import java.util.Scanner;

public class CalculadoraRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite as coordenadas do vértice superior esquerdo (x1 y1): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.print("Digite as coordenadas do vértice inferior direito (x2 y2): ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();


        if (x1 == x2 || y1 == y2) {
            if (x1 == x2 && y1 == y2) {
                System.out.println("É um ponto.");
            } else if (x1 == x2) {
                System.out.println("É uma reta vertical.");
            } else {
                System.out.println("É uma reta horizontal.");
            }
        } else {
            System.out.println("É um retângulo.");
        }


        int largura = Math.abs(x2 - x1);
        int altura = Math.abs(y2 - y1);
        int area = largura * altura;
        System.out.println("A área do retângulo é: " + area);


        System.out.print("Digite as coordenadas do outro ponto (x y): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();


        if (x < x1 && y > y2) {
            System.out.println("Acima e à esquerda");
        } else if (x > x2 && y > y2) {
            System.out.println("Acima e à direita");
        } else if (x < x1 && y < y1) {
            System.out.println("Embaixo e à esquerda");
        } else if (x > x2 && y < y1) {
            System.out.println("Embaixo e à direita");
        } else if (x < x1) {
            System.out.println("À esquerda");
        } else if (x > x2) {
            System.out.println("À direita");
        } else if (y > y2) {
            System.out.println("Acima");
        } else if (y < y1) {
            System.out.println("Embaixo");
        } else if (x >= x1 && x <= x2 && y >= y1 && y <= y2) {
            System.out.println("Dentro do retângulo");
        } else {
            System.out.println("Na linha do retângulo");
        }

        scanner.close();
    }
}


