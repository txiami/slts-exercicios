package Lista03._55_Exercício;

import java.util.Scanner;

public class CalculadoraPlanoCelular {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 100.0;
        double valorPorMinutoOutrasOperadoras = 0.65;
        double valorPorMinutoVaiVai = 0.20;
        double valorPorMinutoTelefoneFixo = 0.325;

        System.out.println("Bem-vindo à operadora Vai-Vai!");

        char continuar = 's';
        while (continuar == 's') {
            System.out.print("Digite o tipo de ligação ('o' para outras operadoras, 'v' para Vai-Vai, 'f' para telefone fixo): ");
            char tipoLigacao = scanner.next().charAt(0);

            System.out.print("Digite a quantidade de minutos: ");
            int minutos = scanner.nextInt();

            double valorAPagar;
            if (tipoLigacao == 'o') {
                valorAPagar = minutos * valorPorMinutoOutrasOperadoras;
            } else if (tipoLigacao == 'v') {
                valorAPagar = minutos * valorPorMinutoVaiVai;
            } else if (tipoLigacao == 'f') {
                valorAPagar = minutos * valorPorMinutoTelefoneFixo;
            } else {
                System.out.println("Tipo de ligação inválido.");
                continue;
            }

            saldo -= valorAPagar;

            System.out.println("Saldo restante: " + saldo);
            System.out.println("Valor a pagar: " + valorAPagar);

            System.out.print("Deseja fazer outra ligação? (s/n): ");
            continuar = scanner.next().charAt(0);
        }

        System.out.println("Obrigado por usar a operadora Vai-Vai!");

        scanner.close();
    }
}

