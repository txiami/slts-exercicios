package _23_Lista03;

import java.util.Scanner;

public class AniversarioPrimeiro {
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);


        System.out.printf("QUEM FAZ ANIVERSARIO PRIMEIRO ENTRE DUAS PESSOAS\n\n");

        System.out.print("Qual o seu nome? ");
        String nome1 = input.nextLine();
        System.out.print("Qual o dia do seu aniversario ? ");
        int dia1 = input.nextInt();
        System.out.print("Qual o numero do mês do seu aniversario ? ");
        int mes1 = input.nextInt();

        input.nextLine();

        System.out.print("Qual o seu nome? ");
        String nome2 = input.nextLine();
        System.out.print("Qual o dia do seu aniversario ? ");
        int dia2 = input.nextInt();
        System.out.print("Qual o numero do mês do seu aniversario ? ");
        int mes2 = input.nextInt();


        if ((mes1 == mes2 && dia1 < dia2) || mes1 < mes2) {
            System.out.println(nome1 + " Faz aniversario primeiro");
        } else if ((mes1 == mes2 && dia2 < dia1) || mes2 < mes1) {
            System.out.println(nome2 + " Faz aniversario primeiro");
        }

    }
}
