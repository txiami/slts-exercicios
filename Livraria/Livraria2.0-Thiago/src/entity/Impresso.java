package entity;

public class Impresso extends Book {
    private float frete;
    private int estoque;

    public Impresso(String titulo, String autores, String editora, float preco, float frete, int estoque) {
        super(titulo, autores, editora, preco);
        this.frete = frete;
        this.estoque = estoque;
    }

    public void atualizarEstoque() {
        if (estoque > 0) {
            estoque--;
        } else {
            System.out.println("Livros impressos esgotados.");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Tipo: Impresso\n" +
                "Frete: R$" + frete + "\n" +
                "Estoque: " + estoque + " unidades\n";
    }
}
