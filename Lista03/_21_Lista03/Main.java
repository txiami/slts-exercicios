package Lista03._21_Lista03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double salary;
		String position;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Por favor, informe o cargo.");
		position = in.nextLine();
		
		System.out.println("Por favor, informe o salário.");
		salary = in.nextDouble();
		
		System.out.println(
				"O emprestimo disponível no momento é de: " 
						+ avaliableLoan(position, salary)
		);
		
		in.close();
	}
	
	
	public static double avaliableLoan(String position, double salary) {
		return switch(position.toUpperCase()) {
			case "DIRETORIA" -> salary * 0.3;
			case "GERÊNCIA" -> salary * 0.25;
			case "OPERACIONAL" -> salary * 0.2;
			default -> 0;
		};
	}

}
