package Lista04;

public class Peixe extends AnimalMarinhoAB {

	public Peixe(
			String nome, int idade, String tipoAnimal,
			String habitat, double peso, double altura
	) {
		super(nome, idade, tipoAnimal, habitat, peso, altura);
	}


    @Override
    public void comer() {
    	massa += 0.125;
        System.out.println("O peixe comeu " + massa + " Kg de alimento.");
    }

    @Override
    public void moverse() {
    	distancia += 1;
        System.out.println("O peixe moveu-se " + distancia + " metros.");
    }

    @Override
    public void dormir() {
    	tempo += 1;
        System.out.println("O peixe dormiu " + tempo + " horas.");
    }	
}