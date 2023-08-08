package Lista04._03_Exercicio.app;

import Lista04._03_Exercicio.animais.Cachorro;
import Lista04._03_Exercicio.animais.Elefante;
import Lista04._03_Exercicio.animais.Gato;
import Lista04._03_Exercicio.animais.Leao;

public class Main {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		Elefante elefante = new Elefante();
		Gato gato = new Gato();
		Leao leao = new Leao();
		
		System.out.println("Cachorro:" );
		cachorro.dormir(2);
		System.out.println("Gato:" );
		gato.moverse(2);
		System.out.println("Elefante:" );
		elefante.comer(10);
		System.out.println("Leao:" );
		leao.comer(5);
	}
}
