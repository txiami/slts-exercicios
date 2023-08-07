package Lista03._49_Exercício;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 50;

        long primeiroTermo = 1;
        long segundoTermo = 1;

        System.out.println("Os primeiros " + n + " números da sequência de Fibonacci:");

        System.out.print(primeiroTermo + ", " + segundoTermo);

        for (int i = 3; i <= n; i++) {
            long proximoTermo = primeiroTermo + segundoTermo;
            System.out.print(", " + proximoTermo);

            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

        System.out.println();
    }
}

