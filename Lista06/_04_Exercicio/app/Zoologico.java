package app;

import animais.Animal;
import animais.Baleia;
import animais.Cachorro;
import animais.Cavalo;
import animais.Cigarra;
import animais.ConsegueCorrer;
import animais.Elefante;
import animais.Gaivota;
import animais.Gato;
import animais.Golfinho;
import animais.Leao;
import animais.Sapo;

public class Zoologico {

	public static void main(String[] args) {
		Animal[] jaulas = new Animal[10];
        jaulas[0] = new Cachorro(1);
        jaulas[1] = new Gato(2);
        jaulas[2] = new Cavalo(3);
        jaulas[3] = new Elefante(4);
        jaulas[4] = new Leao(5);
        jaulas[5] = new Baleia(6);
        jaulas[6] = new Cigarra(7);
        jaulas[7] = new Golfinho(8);
        jaulas[8] = new Sapo(9);
        jaulas[9] = new Gaivota(10);
        
        Corredor corredor = new Corredor();
        for (Animal animal : jaulas) {
            if (animal != null) {
                animal.emitirSom();
                corredor.correr(animal);
            }
        }
		
	}

public static class Corredor {
	    public void correr(Animal animal) {
	        if (animal instanceof ConsegueCorrer) {
	            ((ConsegueCorrer) animal).correr();
	        }
	    }
	}
}
