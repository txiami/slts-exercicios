package entity;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private List<Book> livros = new ArrayList<>();
    private static int numVendas = 0;
    private int numero = numVendas;
    private String cliente;
    private float valor;

    public Venda(String cliente) {
        this.cliente = cliente;
        this.valor = 0;
        numVendas++;
    }

    public void addLivro(Book livro) {
        livros.add(livro);
        valor += livro.getPreco();
    }

    public void listarLivros() {
        System.out.println("Livros na venda:");
        for (Book livro : livros) {
            System.out.println(livro);
        }
    }

    public float valorTotal() {
        float total = 0;
        for (Book livro : livros) {
            total += livro.getPreco();
        }
        return total;
    }

    public float getValor() {
        return valor;
    }

    public String getCliente() {
        return cliente;
    }

    public static int getNumVendas() {
        return numVendas;
    }


    @Override
    public String toString() {
        return "Venda{" +
                "numero=" + numero +
                ", cliente='" + cliente + '\'' +
                ", valor=" + valor +
                '}';
    }
}
