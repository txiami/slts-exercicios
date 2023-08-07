package Lista03._02_Lista03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double employeeSalary, minSalary;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor do salário do funcionário:");
        employeeSalary = in.nextDouble();

        System.out.println("Digite o valor do salário mínimo atual:");
        minSalary = in.nextDouble();

        System.out.printf("O funcionário ganha %.2f salários mínimos.%n", (employeeSalary / minSalary));
    }
}
