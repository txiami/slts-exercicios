package _07_Commission;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double totalDebt;
		
		System.out.println("Por favor, informe o valor total da despesa: ");
		totalDebt = in.nextDouble();
		
		System.out.println("A comissão do garçom é de: " + (totalDebt * 0.1));
		in.close();
	}

}
