package Main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double[] notes = new double[4];
		double sum = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe as quatro notas do aluno: ");
		for(int i = 0; i < 4; i++) {
			notes[i] = in.nextDouble();
			sum += notes[i];
		}
		
		in.close();
		System.out.println("A média do aluno é: " + (sum / notes.length));
	}
}
