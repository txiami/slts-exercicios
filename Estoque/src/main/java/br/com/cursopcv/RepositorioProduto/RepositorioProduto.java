package br.com.cursopcv.RepositorioProduto;

import br.com.cursopcv.modelo.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RepositorioProduto {

    EntityManagerFactory emf;
    EntityManager em;

    public RepositorioProduto(){
        emf = Persistence.createEntityManagerFactory("estoque-jpa");
        em = emf.createEntityManager();
    }

    public void salvar(Produto produto){
        try {
            em.getTransaction().begin();
            em.merge(produto);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        }
    }

    public void remove(Produto produto){

        em.getTransaction().begin();
        em.remove(produto);
        em.getTransaction().commit();
    }

    public Produto obterPorCod(Long cod) {
        return em.find(Produto.class, cod);
    }

    public void fecharEntityManager() {
        em.close();
    }
}

