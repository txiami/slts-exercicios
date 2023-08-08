package animais;

public class Leao extends Animal implements ConsegueCorrer{
	
	public Leao(int numeroJaula) {
        super("leão", "rugido", numeroJaula);
    }

	@Override
	public void correr() {
		System.out.println("O leão está correndo!");
	}
}
