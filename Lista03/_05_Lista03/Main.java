package Lista03._05_Lista03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double initialDebt, totalDebt, fees;
		int months; 
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe o valor da dívida inicial: ");
		initialDebt = in.nextDouble();
		
		System.out.println("Informe a quantidade de meses: ");
		months = in.nextInt();
		
		System.out.println("Por fim, informe os juros mensais: ");
		fees = in.nextDouble();
		
		
		totalDebt = initialDebt + ((initialDebt * fees * months) / 100);
		
		System.out.println("O débito total é: " + totalDebt + " reais");
		in.close();
	}
}
