package _19_CrescNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNumber, secondNumber;
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        firstNumber = in.nextInt();

        System.out.print("Digite o segundo número: ");
        secondNumber = in.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(secondNumber + ", " + firstNumber);
        } else {
            System.out.println(firstNumber + ", " + secondNumber);
        }

        in.close();
    }
}
