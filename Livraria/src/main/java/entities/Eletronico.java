package entities;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity(name = "Eletronicos")
public class Eletronico extends Livro implements Serializable {
    private int tamanho;

    public Eletronico() {}
    public Eletronico(
            String titulo,
            String autores,
            String editora,
            float preco,
            int tamanho
    ) {
        super(titulo, autores, editora, preco);
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return String.format(
                "| %-10s | %-15s | %-15s | R$%-6.2f | %-15d KB ",
                titulo, autores, editora, preco, tamanho
        );
    }

}
