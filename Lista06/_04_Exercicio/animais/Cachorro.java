package animais;

public class Cachorro extends Animal implements ConsegueCorrer{
	
	public Cachorro(int numeroJaula) {
        super("cachorro", "latido", numeroJaula);
    }

	@Override
	public void correr() {
		System.out.println("O cachorro está correndo!");
	}
}
