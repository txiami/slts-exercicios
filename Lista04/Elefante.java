package Lista04;

public class Elefante extends AnimalTerrestreAB {

	public Elefante(
			String nome, int idade, String tipoAnimal,
			String habitat, double peso, double altura,
			int patas
	) {
		super(nome, idade, tipoAnimal, habitat, peso, altura, patas);
	}


    @Override
    public void comer() {
    	massa += 1;
        System.out.println("O elefante comeu " + massa + " Kg de alimento.");
    }

    @Override
    public void moverse() {
    	distancia += 1;
        System.out.println("O elefante moveu-se " + distancia + " Km.");
    }

    @Override
    public void dormir() {
    	tempo += 1;
        System.out.println("O elefante dormiu " + tempo + " horas.");
    }
}