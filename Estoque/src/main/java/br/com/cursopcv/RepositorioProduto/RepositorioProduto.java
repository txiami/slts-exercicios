package br.com.cursopcv.RepositorioProduto;

import br.com.cursopcv.modelo.Produto;
import br.com.cursopcv.utils.ConnectionFactory;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class RepositorioProduto {

    private final EntityManager em;

    public RepositorioProduto() {
        em = ConnectionFactory.getEntityManager();
    }

    public void salvar(Produto produto) {
        try {
            ConnectionFactory.iniciarTransacao(em);
            em.merge(produto);
            ConnectionFactory.finalizarTransacao(em);
        } catch (Exception e) {
            ConnectionFactory.rollbackTransacao(em);
            throw e;
        } finally {
            ConnectionFactory.fecharEntityManager(em);
        }
    }

    public void salvar(List<Produto> produtos) {
        try {
            ConnectionFactory.iniciarTransacao(em);
            for (Produto produto : produtos) {
                em.merge(produto);
            }
            ConnectionFactory.finalizarTransacao(em);
        } catch (Exception e) {
            ConnectionFactory.rollbackTransacao(em);
            throw e;
        } finally {
            ConnectionFactory.fecharEntityManager(em);
        }
    }

    public void remove(Produto produto) {
        try {
            ConnectionFactory.iniciarTransacao(em);
            em.remove(em.merge(produto));
            ConnectionFactory.finalizarTransacao(em);
        } catch (Exception e) {
            ConnectionFactory.rollbackTransacao(em);
            throw e;
        } finally {
            ConnectionFactory.fecharEntityManager(em);
        }
    }

    public List<Produto> listarTodosProdutos() {
        try {
            EntityManager em = ConnectionFactory.getEntityManager();
            ConnectionFactory.iniciarTransacao(em);
            Query query = em.createQuery("SELECT p FROM Produto p");
            List<Produto> produtos = query.getResultList();
            ConnectionFactory.finalizarTransacao(em);
            return produtos;
        } catch (Exception e) {
            ConnectionFactory.rollbackTransacao(em);
            e.printStackTrace();
            throw e;
        } finally {
            ConnectionFactory.fecharEntityManager(em);
        }
    }

    public Produto obterPorCod(int cod) {
        try {
            ConnectionFactory.iniciarTransacao(em);
            Produto produto = em.find(Produto.class, cod);
            ConnectionFactory.finalizarTransacao(em);
            return produto;
        } catch (Exception e) {
            ConnectionFactory.rollbackTransacao(em);
            e.printStackTrace();
            throw e;
        }
    }
}
