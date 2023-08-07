package _35_RandomNumbersDefinedByUser;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int start, end, maxQuantity;
		Random randI = new Random();
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("Informe a faixa inicial:");
	    start = in.nextInt();
	    
	    System.out.println("Informe a faixa final:");
	    end = in.nextInt();
	    

	    System.out.println("Informe a quantidade de números que serão sorteados:");
	    maxQuantity = in.nextInt();

	   
	    for (int i = 0; i < maxQuantity; i++) {
	        int myRandInt = randI.ints(start, end).findAny().getAsInt();
	        System.out.print(myRandInt + " ");
	    }
	    
	    in.close();
	}

}
