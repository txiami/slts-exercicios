package animais;

public class Gato extends Animal implements ConsegueCorrer{
	
	public Gato(int numeroJaula) {
        super("gato", "miado", numeroJaula);
    }

	@Override
	public void correr() {
		System.out.println("O gato está correndo!");
	}
}
