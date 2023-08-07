package Lista03._45_Lista03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> numeros = new ArrayList<>();
		int quantidadeNumeros = 100;
		int maxValor = 0;
		
		System.out.println("Digite 100 números inteiros");
		for(int i=0; i<quantidadeNumeros; i++ ) {
			int numero = sc.nextInt();
			numeros.add(numero);
		}
		
		for (int numero : numeros) {
            if(numero>maxValor) {
            	maxValor = numero;
            }
        }
		System.out.println("O valor máximo da lista é " + maxValor);
		sc.close();
	}
}
