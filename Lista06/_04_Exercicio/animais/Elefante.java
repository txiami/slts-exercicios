package animais;

public class Elefante extends Animal implements ConsegueCorrer{
	
	public Elefante(int numeroJaula) {
        super("elefante", "bramido", numeroJaula);
    }

	@Override
	public void correr() {
		System.out.println("O elefante está correndo!");
	}
}
