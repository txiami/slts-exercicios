package _38_IsPrime;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("Informe um número:");
	    
	    if(in.nextInt() % 2 != 0) {
	    	System.out.println("É primo!");
	    } else {
	    	System.out.println("Não é primo");
	    }
	    	
	    in.close();
	}
}
