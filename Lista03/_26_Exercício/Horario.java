package _26_Exercício;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Horario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro horário (HH:MM:SS): ");
        String horario1 = scanner.nextLine();

        System.out.print("Digite o segundo horário (HH:MM:SS): ");
        String horario2 = scanner.nextLine();

        int diferenca = diferencaEmSegundos(horario1, horario2);

        System.out.println("A diferença entre os horários é de " + diferenca + " segundos.");

        scanner.close();
    }

    public static int horarioParaSegundos(String horario) {
        String[] partes = horario.split(":");
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);
        int segundos = Integer.parseInt(partes[2]);
        return horas * 3600 + minutos * 60 + segundos;
    }

    public static int diferencaEmSegundos(String horario1, String horario2) {
        int segundos1 = horarioParaSegundos(horario1);
        int segundos2 = horarioParaSegundos(horario2);
        return Math.abs(segundos1 - segundos2);
    }
}
