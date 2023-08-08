package Lista04;

public abstract class AnimalTerrestreAB extends AnimalAB {	
	protected int quantidadePatas;
	
	public AnimalTerrestreAB(
			String nome, int idade, String tipoAnimal,
			String habitat, double peso, double altura, int quantidadePatas
	) {
		super(nome, idade, tipoAnimal, habitat, peso, altura);
		this.quantidadePatas = quantidadePatas;
	}
}