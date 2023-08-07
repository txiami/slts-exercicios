package _13_StudentEvaluationFinalTest;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        int averageGrade = 0;
	        
	        Scanner in = new Scanner(System.in);
	        
	        for (int i = 0; i < 3; i++) {
	            System.out.println("Informe a " + (i + 1) + "ª nota: ");
	            averageGrade += in.nextInt();
	        }

	        averageGrade /= 3;	        

	        if (averageGrade >= 7) {
	            System.out.println("Parabéns, você passou!");
	        } else if (averageGrade >= 5 && averageGrade < 7) {
	            System.out.println("Você está de recuperação!");
	            System.out.println("Informe a nota da prova final: ");
	            
	            int finalGrade = in.nextInt();

	            if (finalGrade >= 5.0) {
	                System.out.println("Parabéns, você passou!");
	            } else {
	                System.out.println("Infelizmente você reprovou!");
	            }
	        } else {
	            System.out.println("Infelizmente você reprovou!");
	        }

	        in.close();
	    }
}
