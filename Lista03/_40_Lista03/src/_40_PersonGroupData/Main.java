package _40_PersonGroupData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> personsAge = new ArrayList<>();
        int maxPeoples = 0, sum = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Informe a quantidade de pessoas contidas no grupo: ");
        maxPeoples = in.nextInt();

        for (int i = 0; i < maxPeoples; i++) {
            System.out.println("Informe a idade da pessoa " + (i + 1) + ": ");
            personsAge.add(in.nextInt());
            sum += personsAge.get(i);
        }

        int minAge = Collections.min(personsAge);
        int maxAge = Collections.max(personsAge);
        long olderThan18 = personsAge.stream().filter(n -> n >= 18).count();

        double averageAge = (double) sum / maxPeoples;

        System.out.println("A média das idades é: " + averageAge);
        System.out.println("A maior das idades é: " + maxAge);
        System.out.println("A menor das idades é: " + minAge);
        System.out.println("A quantidade de pessoas maior de 18 anos é: " + olderThan18);

        in.close();
    }
}
