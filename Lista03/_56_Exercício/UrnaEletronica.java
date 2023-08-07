package _56_Exercício;

import java.util.Scanner;

public class UrnaEletronica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Urna Eletrônica!");
        System.out.print("Digite o nome do primeiro candidato: ");
        String candidato1 = scanner.nextLine();

        System.out.print("Digite o nome do segundo candidato: ");
        String candidato2 = scanner.nextLine();

        System.out.print("Digite o nome do terceiro candidato: ");
        String candidato3 = scanner.nextLine();

        int totalVotos = 0;
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosBranco = 0;

        char continuar = 's';
        while (continuar == 's') {
            System.out.println("Opções de voto:");
            System.out.println("1 - " + candidato1);
            System.out.println("2 - " + candidato2);
            System.out.println("3 - " + candidato3);
            System.out.println("0 - Voto em branco");
            System.out.print("Digite o número da opção desejada: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                votosCandidato1++;
            } else if (opcao == 2) {
                votosCandidato2++;
            } else if (opcao == 3) {
                votosCandidato3++;
            } else if (opcao == 0) {
                votosBranco++;
            } else {
                System.out.println("Opção inválida.");
                continue;
            }

            totalVotos++;

            System.out.print("Deseja continuar votando? (s/n): ");
            continuar = scanner.next().charAt(0);
        }

        double percentualCandidato1 = (double) votosCandidato1 / totalVotos * 100;
        double percentualCandidato2 = (double) votosCandidato2 / totalVotos * 100;
        double percentualCandidato3 = (double) votosCandidato3 / totalVotos * 100;
        double percentualBranco = (double) votosBranco / totalVotos * 100;

        String ganhador = "Empate";
        if (votosCandidato1 > votosCandidato2 && votosCandidato1 > votosCandidato3) {
            ganhador = candidato1;
        } else if (votosCandidato2 > votosCandidato1 && votosCandidato2 > votosCandidato3) {
            ganhador = candidato2;
        } else if (votosCandidato3 > votosCandidato1 && votosCandidato3 > votosCandidato2) {
            ganhador = candidato3;
        }

        System.out.println("\nResultado da Eleição:");
        System.out.println(candidato1 + ": " + votosCandidato1 + " votos (" + percentualCandidato1 + "%)");
        System.out.println(candidato2 + ": " + votosCandidato2 + " votos (" + percentualCandidato2 + "%)");
        System.out.println(candidato3 + ": " + votosCandidato3 + " votos (" + percentualCandidato3 + "%)");
        System.out.println("Votos em branco: " + votosBranco + " votos (" + percentualBranco + "%)");
        System.out.println("Total de votos: " + totalVotos);
        System.out.println("Ganhador: " + ganhador);

        scanner.close();
    }
}

