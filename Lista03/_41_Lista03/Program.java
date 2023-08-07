package Lista03._41_Lista03;

import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random gerador = new Random();
		int numeroSorteado = gerador.nextInt(100) + 1;
		int tentativa = 0;
		int escolha;
		
		do{
			System.out.println("Digite um número inteiro entre 1 e 100");
			escolha = sc.nextInt();
			tentativa++;
			if(escolha == numeroSorteado) {
				System.out.println("Parabens, você acertou em " + tentativa + " tentativas.");
			} else if(escolha<numeroSorteado) {
				System.out.println("O número escolhido é maior!");
			} else {
				System.out.println("O número escolhido é menor!");
			}
			
		} while(escolha != numeroSorteado);
		sc.close();
	}
}
