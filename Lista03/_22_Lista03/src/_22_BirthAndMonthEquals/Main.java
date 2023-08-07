package _22_BirthAndMonthEquals;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	String birthDayOne, birthDayTwo;
        Scanner in = new Scanner(System.in);

        System.out.print("Informe a primeira data de aniversário (dd/mm): ");
        birthDayOne = in.nextLine();

        System.out.print("Informe a segunda data de aniversário (dd/mm): ");
        birthDayTwo = in.nextLine();

        if (isEquals(birthDayOne, birthDayTwo)) {
            System.out.println("As duas datas de aniversário são iguais.");
        } else {
            System.out.println("As duas datas de aniversário são diferentes.");
        }

        in.close();
    }

    public static boolean isEquals(String birthDayOne, String birthDayTwo) {
        boolean isEqual = false;
        
    	if(birthDayOne.equals(birthDayTwo))  {
        	isEqual = true;
        }
    	
    	return isEqual;
    }
}
