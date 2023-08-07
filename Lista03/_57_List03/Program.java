package Lista03._57_List03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe a primeira data no formato (dd/mm/aaaa): ");
		String data1 = sc.nextLine();
		System.out.print("Informe a segunda data no formato (dd/mm/aaaa): ");
		String data2 = sc.nextLine();
		
		DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate data1Formatada = LocalDate.parse(data1, formatar);
		LocalDate data2Formatada = LocalDate.parse(data2, formatar);
		
		procurarDatasEntre(data1Formatada, data2Formatada);
		
		sc.close();
	}

	public static void procurarDatasEntre(LocalDate data1, LocalDate data2) {
		LocalDate proximaData = data1.plusDays(1);

        while (proximaData.isBefore(data2)) {
            System.out.println(proximaData.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            proximaData = proximaData.plusDays(1);
        }
	}
}
