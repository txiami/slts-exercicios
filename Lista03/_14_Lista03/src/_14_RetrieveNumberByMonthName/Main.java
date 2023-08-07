package _14_RetrieveNumberByMonthName;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Por favor, informe um número de 1 a 12.");
		System.out.println(retrieveNumberByMonthName(in.nextLine()));
		
	}

	private static int retrieveNumberByMonthName(String month) {
		return switch(month.toUpperCase()) {
			case "JANEIRO" -> 1;
			case "FEVEREIRO" -> 2;
			case "MARÇO" -> 3;
			case "ABRIL" -> 4;
			case "MAIO" -> 5;
			case "JUNHO" -> 6;
			case "JULHO" -> 7;
			case "AGOSTO" -> 8;
			case "SETEMBRO" -> 9;
			case "OUTUBRO" -> 10;
			case "NOVEMBRO" -> 11;
			case "DEZEMBRO" -> 12;
		default -> -1;
		};
	}
}
