
package herancaepolimorfismo;


public class Preguica extends Animal{
    
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A preguiça emite um som: Zzzzzz...");
    }

    public void subirEmArvores() {
        System.out.println("A preguiça sobe em árvores lentamente.");
    }
    
}
