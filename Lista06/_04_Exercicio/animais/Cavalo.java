package animais;

public class Cavalo extends Animal implements ConsegueCorrer{
	
	public Cavalo(int numeroJaula) {
        super("cavalo", "relinche", numeroJaula);
    }

	@Override
	public void correr() {
		System.out.println("O cavalo está correndo!");
	}
}
