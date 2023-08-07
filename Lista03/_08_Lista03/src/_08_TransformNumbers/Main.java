package _08_TransformNumbers;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int rationalNumber, denominator;
		
		System.out.println("Informe um número racional: ");
		rationalNumber = in.nextInt();
		
		System.out.println("Informe o denominador: ");
		denominator = in.nextInt();
		
		if(denominator == 0) {
			System.out.println("O denominador não pode ser zero");
		} else {
			double result = (double) rationalNumber / denominator;
			System.out.println("O número real é: " + result);
		}
	}
}
