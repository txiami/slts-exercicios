package Lista03._37_Lista03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("Informe um número:");
	    
	    System.out.println("O fatorial é: " + calcFactorial(in.nextInt()));
	    
	    in.close();
	}
	
	public static long calcFactorial(int n) {
        if (n > 1) {
        	return n * calcFactorial(n - 1);
        } else {
        	return 1;
        }
    }
}
