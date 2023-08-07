package _28_SortNumbers;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] numbers = new int[3];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Por favor, informe o número " + (i + 1));
            numbers[i] = in.nextInt();
        }

        Arrays.sort(numbers);

        for(int i : numbers) {
        	System.out.println(i);
        }
		
        in.close();
	}
}
