package Lista03._09_Lista03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe a idade: ");
		
		if(in.nextInt() >= 18) {
			System.out.println("O usuário é maior de idade.");
		} else {
			System.out.println("O usuário é menor de idade.");
		}
		
		in.close();
	}
}
