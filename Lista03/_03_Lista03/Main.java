package Lista03._03_Lista03;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int men, women, totalStudents;
		double menPercentage, womenPercentage;
		
		System.out.println("Por favor, informe a quantidade de homens da turma: ");
		men = in.nextInt();
		
		System.out.println("Por favor, informe a quantidade de mulheres da turma: ");
		women = in.nextInt();
		
		totalStudents = men + women;
		menPercentage = ((double) men / totalStudents) * 100;
		womenPercentage = ((double) women / totalStudents) * 100;
		
		in.close();
		System.out.println("A porcentagem de homens e: " + menPercentage);
		System.out.println("A porcentagem de mulheres e: " + womenPercentage);
	}

}
