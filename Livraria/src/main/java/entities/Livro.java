package entities;

import javax.persistence.*;

@Entity
@Table(name = "livro")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo", discriminatorType = DiscriminatorType.STRING)
public abstract class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    protected int indice;
    protected String titulo, autores, editora;
    protected float preco;

    public Livro() {

    }

    public Livro(int indice, String titulo, String autores, String editora, float preco) {
        this.indice = indice;
        this.titulo = titulo;
        this.autores = autores;
        this.editora = editora;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autores='" + autores + '\'' +
                ", editora='" + editora + '\'' +
                ", preco=R$" + preco +
                '}' +
                "\n";
    }
}
