
package heranca;


public class Cachorro extends Animal{
    
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro late: Au au!");
    }
    
}
