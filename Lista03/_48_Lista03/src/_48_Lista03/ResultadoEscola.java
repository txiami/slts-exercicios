package _48_Lista03;

import java.util.Scanner;

public class ResultadoEscola {
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        double soma=0.0f;
        double media=0.0f;

        System.out.println("Quantas notas você tem?");
        int numerosDeNotas = input.nextInt();

        double[] notas = new double[numerosDeNotas];

        while (i < numerosDeNotas) {
            System.out.println("Digite a nota de numero " + (i + 1) + ": ");
            notas[i] = input.nextDouble();
            soma += notas[i];
            i++;
        }
        System.out.println("Quantas faltas você teve?");
        int numerosDeFaltas = input.nextInt();

        media = soma / numerosDeNotas;
        if(media >= 7 && numerosDeFaltas <= 20){
            System.out.println("ALUNO APROVADO");
        } else if (media < 7.0 && numerosDeFaltas <= 15) {
            System.out.println("ALUNO REPROVADO POR NOTA");
        }else{
            System.out.println("ALUNO REPROVADO POR FALTA");
        }


    }

}
