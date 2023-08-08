package Lista04;

public class Pombo extends AnimalVoadorAB {

	public Pombo(
			String nome, int idade, String tipoAnimal,
			String habitat, double peso, double altura,
			int quantidadeAsas, double envergaduraAsas
	) {
		super(nome, idade, tipoAnimal, habitat, peso, altura, quantidadeAsas, envergaduraAsas);
		
	}

    @Override
    public void comer() {
    	massa += 1;
        System.out.println("O pombo comeu " + massa + " Kg de alimento.");
    }

    @Override
    public void moverse() {
    	massa += 5;
        System.out.println("O pombo moveu-se " + distancia + " Km.");
    }

    @Override
    public void dormir() {
    	massa += 1;
        System.out.println("O pombo dormiu " + tempo + " horas.");
    }	
}