package Lista03._27_Lista03;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] numbers = new int[3];
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Por favor, informe o número: " + (i + 1));
			numbers[i] = in.nextInt();	
		}
		
		int biggest = Arrays.stream(numbers).max().getAsInt();

        boolean equals = Arrays.stream(numbers).distinct().count() == 1;

        if (equals) {
            System.out.println("Os três números são iguais: " + numbers[0]);
        } else {
            System.out.println("O maior número é: " + biggest);
        }
		
        in.close();
	}
}
