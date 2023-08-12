package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LivrariaVirtual {
    private static final int MAX_IMPRESSOS = 10;
    private static final int MAX_ELETRONICOS = 20;
    private static final int MAX_VENDAS = 50;
    private List<Impresso> impressos = new ArrayList<>();
    private List<Eletronico> eletronicos = new ArrayList<>();
    private List<Venda> vendas = new ArrayList<>();
    private int numImpressos = 0;
    private int numEletronicos = 0;
    private int numVendas = 0;

    private Scanner scanner = new Scanner(System.in);

    public void cadastrarLivro() {
        System.out.println("Escolha o tipo de livro a ser cadastrado:");
        System.out.println("1. Impresso");
        System.out.println("2. Eletrônico");
        System.out.println("3. Ambos");
        System.out.print("Digite a opção: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        if (tipo < 1 || tipo > 3) {
            System.out.println("Opção inválida. Retornando ao menu principal.");
            return;
        }

        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autores: ");
        String autores = scanner.nextLine();
        System.out.print("Editora: ");
        String editora = scanner.nextLine();
        System.out.print("Preço: ");
        float preco = scanner.nextFloat();

        if (tipo == 1 || tipo == 3) {
            System.out.print("Frete: ");
            float frete = scanner.nextFloat();
            System.out.print("Estoque: ");
            int estoque = scanner.nextInt();

            Impresso impresso = new Impresso(titulo, autores, editora, preco, frete, estoque);
            impressos.add(impresso);
            System.out.println("Livro impresso cadastrado com sucesso.");
        }

        if (tipo == 2 || tipo == 3) {
            System.out.print("Tamanho (KB): ");
            int tamanho = scanner.nextInt();

            Eletronico eletronico = new Eletronico(titulo, autores, editora, preco, tamanho);
            eletronicos.add(eletronico);
            System.out.println("Livro eletrônico cadastrado com sucesso.");
        }
    }

    public void realizarVenda() {
        scanner.nextLine(); // Consumir a nova linha após a opção do menu
        System.out.print("Nome do cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Quantidade de livros a comprar: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        Venda novaVenda = new Venda(cliente);

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Escolha o tipo de livro:");
            System.out.println("1. Impresso");
            System.out.println("2. Eletrônico");
            System.out.print("Digite a opção: ");
            int tipoLivro = scanner.nextInt();
            scanner.nextLine();

            if (tipoLivro == 1) {
                listarLivrosImpressos();
                System.out.print("Escolha o livro impresso (índice): ");
                int indiceImpresso = scanner.nextInt();
                scanner.nextLine();
                Impresso impressoEscolhido = impressos.get(indiceImpresso);
                novaVenda.addLivro(impressoEscolhido);
                impressoEscolhido.atualizarEstoque();
            } else if (tipoLivro == 2) {
                listarLivrosEletronicos();
                System.out.print("Escolha o livro eletrônico (índice): ");
                int indiceEletronico = scanner.nextInt();
                scanner.nextLine();
                Eletronico eletronicoEscolhido = eletronicos.get(indiceEletronico);
                novaVenda.addLivro(eletronicoEscolhido);
            }
        }

        vendas.add(novaVenda);
        numVendas++;
        System.out.println("Venda realizada com sucesso.");
    }

    public void listarLivrosImpressos() {
        System.out.println("Livros Impressos Cadastrados:");
        for (int i = 0; i < impressos.size(); i++) {
            System.out.println("Índice " + i + ":");
            System.out.println(impressos.get(i).toString());
            System.out.println("--------------------------");
        }
    }

    public void listarLivrosEletronicos() {
        System.out.println("Livros Eletrônicos Cadastrados:");
        for (int i = 0; i < eletronicos.size(); i++) {
            System.out.println("Índice " + i + ":");
            System.out.println(eletronicos.get(i).toString());
            System.out.println("--------------------------");
        }
    }

    public void listarLivros() {
        listarLivrosImpressos();
        listarLivrosEletronicos();
    }

    public void listarVendas() {
        System.out.println("Vendas Realizadas:");
        for (Venda venda : vendas) {
            System.out.println("Número da Venda: " + venda.getNumVendas());
            System.out.println("Cliente: " + venda.getCliente());
            System.out.println("Valor Total: R$" + venda.getValor());
            System.out.println("--------------------------");
        }
    }
}
