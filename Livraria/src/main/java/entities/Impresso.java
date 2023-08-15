package entities;

import utils.ConnectionFactory;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import java.io.Serializable;


@Entity(name = "Impressos")
public class Impresso extends Livro implements Serializable {
    private float frete;
    private int estoque;

    public Impresso() {};

    public float getFrete() {
        return frete;
    }

    public void setFrete(float frete) {
        this.frete = frete;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getEstoque() {
        return estoque;
    }



    public Impresso(
            String titulo,
            String autores,
            String editora,
            float preco,
            float frete,
            int estoque
    ) {
        super(titulo, autores, editora, preco);
        this.frete = frete;
        this.estoque = estoque;
    }

    public void atualizarEstoque() {
        if (estoque > 0) {
            int novoEstoque = getEstoque() - 1;
            setEstoque(novoEstoque);

            EntityManager em = ConnectionFactory.getEntityManager();
            em.getTransaction().begin();
            em.merge(this);
            em.getTransaction().commit();
            em.close();
        } else {
            System.out.println("Livros impressos esgotados.");
        }
    }

    @Override
    public String toString() {
        return String.format(
                "| %-10s | %-15s | %-15s | R$%-6.2f | R$%-6.2f | %-6d ",
                titulo, autores, editora, preco, frete, estoque
        );
    }
}
