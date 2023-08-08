package Lista03._47_Lista03.src._47_Lista03;


import java.util.Scanner;

public class RelatorioClinica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maxPacientes = 100;
        String[] nomes = new String[maxPacientes];
        char[] sexos = new char[maxPacientes];
        double[] pesos = new double[maxPacientes];
        int[] idades = new int[maxPacientes];
        double[] alturas = new double[maxPacientes];

        int quantidadePacientes = 0;
        int quantidadeHomens = 0;
        int quantidadeMulheresAltas = 0;
        int quantidadePessoasJovens = 0;
        int idadeMaisVelho = Integer.MIN_VALUE;
        String nomeMaisVelho = "";
        double alturaMulherMaisBaixa = Double.MAX_VALUE;
        String nomeMulherMaisBaixa = "";

        System.out.println("Digite os dados dos pacientes (nome, sexo, peso, idade, altura):");
        while (quantidadePacientes < maxPacientes) {
            String nome = input.next();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            char sexo = input.next().charAt(0);
            double peso = input.nextDouble();
            int idade = input.nextInt();
            double altura = input.nextDouble();

            nomes[quantidadePacientes] = nome;
            sexos[quantidadePacientes] = sexo;
            pesos[quantidadePacientes] = peso;
            idades[quantidadePacientes] = idade;
            alturas[quantidadePacientes] = altura;

            quantidadePacientes++;
        }

        for (int i = 0; i < quantidadePacientes; i++) {
            if (sexos[i] == 'M') {
                quantidadeHomens++;
                if (idades[i] >= 18 && idades[i] <= 25) {
                    quantidadePessoasJovens++;
                }
            } else if (sexos[i] == 'F') {
                if (alturas[i] < alturaMulherMaisBaixa) {
                    alturaMulherMaisBaixa = alturas[i];
                    nomeMulherMaisBaixa = nomes[i];
                }
                if (alturas[i] >= 1.60 && alturas[i] <= 1.70 && pesos[i] > 70) {
                    quantidadeMulheresAltas++;
                }
            }

            if (idades[i] > idadeMaisVelho) {
                idadeMaisVelho = idades[i];
                nomeMaisVelho = nomes[i];
            }
        }

        double mediaIdadeHomens = quantidadeHomens > 0 ? (double) quantidadePessoasJovens / quantidadeHomens : 0;

        System.out.println("Relatório da Clínica");
        System.out.println("Quantidade de pacientes: " + quantidadePacientes);
        System.out.println("Média de idade dos homens: " + mediaIdadeHomens);
        System.out.println("Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: " + quantidadeMulheresAltas);
        System.out.println("Quantidade de pessoas com idade entre 18 e 25: " + quantidadePessoasJovens);
        System.out.println("Nome do paciente mais velho: " + nomeMaisVelho);
        System.out.println("Nome da mulher mais baixa: " + nomeMulherMaisBaixa);
    }
}
