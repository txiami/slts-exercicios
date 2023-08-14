package entities;
import javax.persistence.*;
@Entity(name = "vendas")
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany
    @Transient
    private Livro[] livros = new Livro[50];



    private static int numVendas = 1;

    @OrderColumn(name = "total_vendas")
    private int numero = numVendas;
    private String cliente;
    private float valor;
    private String livro;
    private int livro_indice;

    public Venda() {};

    public Venda(String cliente) {
        this.cliente = cliente;
        this.valor = 0;
        numVendas++;
    }

    public void addLivro(Livro livro, int index) {
        livros[index] = livro;
        this.livro = livro.getTitulo();
        this.livro_indice = index;
        valor += livro.getPreco();
    }

    public void listarLivros() {
        System.out.println("Livros na venda: ");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public Venda(int id, Livro[] livros, int numero, String cliente, float valor) {
        this.id = id;
        this.livros = livros;
        this.numero = numero;
        this.cliente = cliente;
        this.valor = valor;
    }

    public float valorTotal() {
        float total = 0;
        for (Livro livro : livros) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public static void setNumVendas(int numVendas) {
        Venda.numVendas = numVendas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setValor(float valor) {
        this.valor = valor;
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
