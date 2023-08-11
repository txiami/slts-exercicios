package br.com.cursopcv.testes;

import br.com.cursopcv.RepositorioProduto.RepositorioProduto;
import br.com.cursopcv.modelo.Produto;

import java.util.List;

public class ListaTodosProdutos {
    public static void main(String[] args) {
        RepositorioProduto repProduto = new RepositorioProduto();

        List<Produto> produtos = repProduto.listarTodosProdutos();

        for(Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
