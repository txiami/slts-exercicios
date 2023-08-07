package _10_BankLoan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double grossSalary, deductions, loanAmount;

        System.out.println("Informe o valor do salário bruto: ");
        grossSalary = in.nextDouble();

        System.out.println("Informe o valor dos descontos: ");
        deductions = in.nextDouble();

        System.out.println("Informe o valor do possível empréstimo: ");
        loanAmount = in.nextDouble();

        double netSalary = grossSalary - deductions;
        double maxLoanAmount = netSalary * 0.3;

        if (loanAmount <= maxLoanAmount) {
            System.out.println("Empréstimo aprovado! O cliente pode fazer o empréstimo.");
        } else {
            System.out.println("Empréstimo negado! O valor do empréstimo excede o limite permitido.");
        }

        in.close();
    }
}
