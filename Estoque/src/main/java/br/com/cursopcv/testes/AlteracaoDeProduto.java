package br.com.cursopcv.testes;

import br.com.cursopcv.RepositorioProduto.RepositorioProduto;
import br.com.cursopcv.modelo.Produto;
import br.com.cursopcv.utils.ConnectionFactory;

import javax.persistence.EntityManager;

public class AlteracaoDeProduto {
    public static void main(String[] args) {
        EntityManager em = ConnectionFactory.getEntityManager();

        try {
            RepositorioProduto repProduto = new RepositorioProduto();

            ConnectionFactory.iniciarTransacao(em);

            Produto produto = em.find(Produto.class, 2);
            if (produto != null) {
                produto.setPreco(345.00);
                em.merge(produto);
                ConnectionFactory.finalizarTransacao(em);
                System.out.println("Produto alterado com sucesso: " + produto);
            } else {
                ConnectionFactory.rollbackTransacao(em);
                System.out.println("Produto não encontrado.");
            }
        } catch (Exception e) {
            ConnectionFactory.rollbackTransacao(em);
            e.printStackTrace();
        } finally {
            ConnectionFactory.fecharEntityManager(em);
        }
    }
}
