package Lista04;

public class Leao extends AnimalTerrestreAB{

	
	public Leao(
			String nome, int idade, String tipoAnimal,
			String habitat, double peso, double altura,
			int patas
	) {
		super(nome, idade, tipoAnimal, habitat, peso, altura, patas);
	}


    @Override
    public void comer() {
    	massa += 1;
        System.out.println("O leao comeu " + massa + " Kg de alimento.");
    }

    @Override
    public void moverse() {
    	distancia += 1;
        System.out.println("O leao moveu-se " + distancia + " Km.");
    }

    @Override
    public void dormir() {
    	tempo += 1;
        System.out.println("O leao dormiu " + tempo + " horas.");
    }		
}