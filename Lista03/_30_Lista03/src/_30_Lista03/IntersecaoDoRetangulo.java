package Lista03._30_Lista03.src._30_Lista03;

import java.util.Scanner;

public class IntersecaoDoRetangulo {
    public static void main (String arg []){

                Scanner input = new Scanner(System.in);

                System.out.println("Digite as coordenadas do primeiro retângulo:");
                int x1 = input.nextInt();
                int y1 = input.nextInt();
                int x2 = input.nextInt();
                int y2 = input.nextInt();

                System.out.println("Digite as coordenadas do segundo retângulo:");
                int x3 = input.nextInt();
                int y3 = input.nextInt();
                int x4 = input.nextInt();
                int y4 = input.nextInt();

                boolean intersecao = (x1 < x4 && x2 > x3) && (y1 < y4 && y2 > y3);

                if (intersecao) {
                    System.out.println("Os dois retângulos se interceptam.");
                } else {
                    System.out.println("Os dois retângulos não se interceptam.");
                }
            }
        }
