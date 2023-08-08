
package heranca;


public class Cavalo extends Animal{
    
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cavalo relincha: Hiiin in in!");
    }
    
}
