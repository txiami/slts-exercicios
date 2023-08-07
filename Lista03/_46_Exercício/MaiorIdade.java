package Lista03._46_Exercício;

import java.util.Scanner;

public class MaiorIdade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalPessoas = 200;
        int contadorHomensMaioresIdade = 0;
        int contadorMulheresMaioresIdade = 0;

        for (int i = 0; i < totalPessoas; i++) {
            System.out.print("Informe o gênero (M/F) da pessoa " + (i + 1) + ": ");
            char genero = scanner.next().charAt(0);

            System.out.print("Informe a idade da pessoa " + (i + 1) + ": ");
            int idade = scanner.nextInt();

            if (genero == 'M' && idade >= 18) {
                contadorHomensMaioresIdade++;
            } else if (genero == 'F' && idade >= 18) {
                contadorMulheresMaioresIdade++;
            }
        }

        System.out.println("Quantidade de homens maiores de idade: " + contadorHomensMaioresIdade);
        System.out.println("Quantidade de mulheres maiores de idade: " + contadorMulheresMaioresIdade);

        scanner.close();
    }
}


