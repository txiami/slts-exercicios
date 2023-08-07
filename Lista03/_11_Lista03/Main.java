package Lista03._11_Lista03;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int age;
        
        Scanner in = new Scanner(System.in);

        System.out.println("Informe a idade: ");
        age = in.nextInt();

        if (age < 16) {
            System.out.println("Não é possível votar.");
        } else {
            if (age >= 16 && age < 18 || age >= 65) {
                System.out.println("Voto facultativo.");
            } else {
                System.out.println("Voto obrigatório.");
            }
        }

        in.close();
    }
}
