package Lista03._20_Lista03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[2];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            String name = in.nextLine();

            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int age = in.nextInt();
            in.nextLine();

            persons[i] = new Person(name, age);
        }

        Person youngestPerson = persons[0];
        Person oldestPerson = persons[0];

        for (int i = 1; i < 2; i++) {
            if (persons[i].getAge() < youngestPerson.getAge()) {
                youngestPerson = persons[i];
            }

            if (persons[i].getAge() > oldestPerson.getAge()) {
                oldestPerson = persons[i];
            }
        }

        System.out.println("A pessoa mais velha é: " + oldestPerson.getName());
        System.out.println("A pessoa mais nova é: " + youngestPerson.getName());

        in.close();
    }
}
