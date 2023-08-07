package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Digite a quantidade números que deseja calcular a média: ");
				int numeros = sc.nextInt();
				int soma = 0;
				
				System.out.println("Digite os valores: ");
				for(int i=0; i<numeros; i++) {
					int valor = sc.nextInt();
					soma+=valor;
				}				
				double media = (double)soma/numeros;
				System.out.println("Média: " + media);		
				sc.close();			
	}
}
