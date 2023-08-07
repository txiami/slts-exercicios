import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int birthYear, currYear, age;

        Scanner in = new Scanner(System.in);

        System.out.println("Por favor, informe o ano de nascimento no formato XXXX.");
        birthYear = in.nextInt();

        System.out.println("Por favor, informe o ano atual no formato XXXX.");
        currYear = in.nextInt();

        age = currYear - birthYear;

        System.out.printf("Sua idade é: %s", age);
    }
}
