package Lista03._34_Lista03;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
        Random randI = new Random();

        System.out.println("50 números sorteados de 1 a 100:");

        for (int i = 0; i < 50; i++) {
            int myRandInt = randI.ints(1, 101).findAny().getAsInt();
            System.out.print(myRandInt + " ");
        }
    }
}
