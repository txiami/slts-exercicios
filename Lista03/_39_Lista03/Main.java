package Lista03._39_Lista03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int number, sum = 0;
		Scanner in = new Scanner(System.in);

        System.out.println("Informe um número:");
        number = in.nextInt();
        sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        System.out.println(
    		(sum == number) 
        		? number + "é perfeito." 
				: number + "não é perfeito."
		);

        in.close();
	}
}
