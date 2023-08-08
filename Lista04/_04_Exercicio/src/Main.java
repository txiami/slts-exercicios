public class Main {
    public static void main(String[] args) {
        Peixe peixe = new Peixe();
        peixe.nadar();

        Pombo pombo = new Pombo();
        pombo.voar();
    }
}

class Peixe extends AnimalMarinhoAB {
    @Override
    void nadar() {
        System.out.println("O peixe nada");
    }
}

class Pombo extends AnimalVoadorAB {
    @Override
    void voar() {
        System.out.println("O pombo voa");
    }
}

abstract class AnimalAB {
	abstract void mover();
}

abstract class AnimalMarinhoAB extends AnimalAB {
    abstract void nadar();
}

abstract class AnimalVoadorAB extends AnimalAB {
    abstract void voar();
}

abstract class AnimalTerrestreAB extends AnimalAB {
    abstract void andar();

}
