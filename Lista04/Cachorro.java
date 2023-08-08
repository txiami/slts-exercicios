package Lista04;

public class Cachorro extends AnimalTerrestreAB {
    public Cachorro(
    		String nome, int idade, String tipoAnimal,
    		String habitat, double peso, double altura,
    		int patas, double massa
    ) {
        super(nome, idade, tipoAnimal, habitat, peso, altura, patas);
    }


    @Override
    public void comer() {
    	massa += 1;
        System.out.println("O cachorro comeu " + massa + " Kg de alimento.");
    }

    @Override
    public void moverse() {
    	distancia += 1;
        System.out.println("O cachorro moveu-se " + distancia + " Km.");
    }

    @Override
    public void dormir() {
    	tempo += 1;
        System.out.println("O cachorro dormiu " + tempo + " horas.");
    }
}