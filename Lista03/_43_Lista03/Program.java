package Lista03._43_Lista03;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int numeros = 0;
				int soma = 0;
				System.out.println("Digite 500 números para calcular a média: ");
				while(numeros<500) {
					int valor = sc.nextInt();
					soma+=valor;
					numeros++;
				}
				double media = (double)soma/numeros;
				System.out.println("Média: " + media);		
				sc.close();			
	}
}
