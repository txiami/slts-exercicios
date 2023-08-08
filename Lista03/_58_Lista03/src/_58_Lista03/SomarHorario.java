package Lista03._58_Lista03.src._58_Lista03;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SomarHorario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual é a data? (dd/MM/yyyy)");
        String dateString = input.nextLine();

        System.out.println("Quantos dias você deseja adicionar?");
        int diasAdicionar = input.nextInt();

        LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        date = date.plusDays(diasAdicionar);

        String novaDataFormatada = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println("A data adicionada é " + novaDataFormatada);
    }
}
