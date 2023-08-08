package Lista04;

public abstract class AnimalVoadorAB extends AnimalAB {
    int quantidadeAsas;
    double envergaduraAsas;

    public AnimalVoadorAB(
    		String nome, int idade, String tipoAnimal,
    		String habitat, double peso, double altura,
            int quantidadeAsas, double envergaduraAsas
    ) {
        super(nome, idade, tipoAnimal, habitat, peso, altura);
        this.quantidadeAsas = quantidadeAsas;
        this.envergaduraAsas = envergaduraAsas;
    }
}