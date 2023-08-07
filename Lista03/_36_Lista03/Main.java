package Lista03._36_Lista03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int start, end;
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("Informe a faixa inicial:");
	    start = in.nextInt();
	    
	    System.out.println("Informe a faixa final:");
	    end = in.nextInt();
	    
	    
	    for(int i = start; i <= end; i++) {
	    	if(i % 2 != 0) {
	    		System.out.println(i);
	    	}
	    }
	    
	    in.close();
	}
}
