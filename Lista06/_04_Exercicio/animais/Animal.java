package animais;

public class Animal {
	String nome;
	String som;
	int numeroJaula;
	
	public Animal() {}

	
	
	public Animal(String nome, String som, int numeroJaula) {
		this.nome = nome;
		this.som = som;
		this.numeroJaula = numeroJaula;
	}

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getSom() {
		return som;
	}



	public void setSom(String som) {
		this.som = som;
	}

	public void emitirSom() {
        System.out.println("Jaula " + numeroJaula + ": " + nome + " - " + som);
    }
	
}
