package Lista04;

public abstract class AnimalAB implements AnimalIF {
	protected int idade;
	protected String nome, tipoAnimal, habitat;
	protected double peso, altura, massa, tempo, distancia;
	
	public AnimalAB(
			String nome, int idade, String tipoAnimal,
			String habitat, double peso, double altura
	) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.tipoAnimal = tipoAnimal;
		this.habitat = habitat;
		this.peso = peso;
		this.altura = altura;
		this.massa = 0; 
        this.tempo = 0; 
        this.distancia = 0;
	}

	@Override
	public void comer() {}

	@Override
	public void dormir() {}

	@Override
	public void moverse() {}
}