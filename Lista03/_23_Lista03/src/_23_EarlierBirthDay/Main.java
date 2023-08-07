package _23_EarlierBirthDay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe a primeira data de aniversário (dd/mm): ");
        String birthDayOne = in.nextLine();

        System.out.print("Informe a segunda data de aniversário (dd/mm): ");
        String birthDayTwo = in.nextLine();

        if (isEquals(birthDayOne, birthDayTwo)) {
            System.out.println("As duas datas de aniversário são iguais.");
        } else {
            System.out.println("As duas datas de aniversário são diferentes.");
        }

        in.close();
    }

    public static boolean isEquals(String birthDayOne, String birthDayTwo) {
        String[] partsOne = birthDayOne.split("/");
        String[] partsTwo = birthDayTwo.split("/");

        int dayOne = Integer.parseInt(partsOne[0]);
        int monthOne = Integer.parseInt(partsOne[1]);

        int dayTwo = Integer.parseInt(partsTwo[0]);
        int monthTwo = Integer.parseInt(partsTwo[1]);

        return (dayOne == dayTwo) && (monthOne == monthTwo);
    }
}