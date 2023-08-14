package repositories.Livraria;

import entities.Eletronico;
import entities.Impresso;
import entities.Venda;
import utils.ConnectionFactory;

import javax.persistence.EntityManager;
import javax.persistence.OneToMany;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LivrariaVirtual {
    private static final int MAX_IMPRESSOS = 10, MAX_ELETRONICOS = 20, MAX_VENDAS = 50;
    private int numImpressos = 0, numEletronicos = 0, numVendas = 0;
    private final EntityManager em;

    @OneToMany
    private Impresso[] impressos = new Impresso[MAX_IMPRESSOS];

    @OneToMany
    private Eletronico[] eletronicos = new Eletronico[MAX_ELETRONICOS];

    @OneToMany
    private List<Venda> vendas = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);

    public LivrariaVirtual() {
        em = ConnectionFactory.getEntityManager();
    }
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
        System.out.print("Índice: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (tipo == 1 || tipo == 3) {
            cadastrarLivroImpresso(index, titulo, autores, editora, preco);
        }

        if (tipo == 2 || tipo == 3) {
            index = tipo == 3 ? index + 1 : index;
            cadastrarLivroEletronico(index, titulo, autores, editora, preco);
        }
    }

    private void cadastrarLivroImpresso(
            int index, String titulo, String autores, String editora, float preco
    ) {
        if(index <= MAX_IMPRESSOS && impressos[index - 1] == null) {
            System.out.print("Frete: ");
            float frete = scanner.nextFloat();
            System.out.print("Estoque: ");
            int estoque = scanner.nextInt();
            scanner.nextLine();

            Impresso impresso = new Impresso(index, titulo, autores, editora, preco, frete, estoque);
            impressos[index - 1] = impresso;

            em.getTransaction().begin();
            em.persist(impresso);
            em.getTransaction().commit();

            System.out.println("Livro impresso cadastrado com sucesso. \n");
        } else {
            System.out.println("Índice maior ou indisponível no momento.");
        }

    }

    private void cadastrarLivroEletronico(
            int index, String titulo, String autores, String editora, float preco
    ) {
        System.out.print("Tamanho (KB): ");
        int tamanho = scanner.nextInt();
        scanner.nextLine();

        Eletronico eletronico = new Eletronico(index, titulo, autores, editora, preco, tamanho);
        eletronicos[index - 1] = eletronico;

        em.getTransaction().begin();
        em.persist(eletronico);
        em.getTransaction().commit();

        System.out.println("Livro eletrônico cadastrado com sucesso. \n");
    }

    public void realizarVenda() {
        var index = 0;
        scanner.nextLine();
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
                index = scanner.nextInt();
                scanner.nextLine();
                Impresso impressoEscolhido = impressos[index - 1];

                if (impressoEscolhido.getEstoque() > 0) {
                    novaVenda.addLivro(impressoEscolhido, index);
                    impressoEscolhido.atualizarEstoque();
                    numImpressos++;
                    break;
                } else {
                    System.out.println("Livro impresso indisponível em estoque.");
                }
            } else if (tipoLivro == 2) {
                listarLivrosEletronicos();
                System.out.print("Escolha o livro eletrônico (índice): ");
                index = scanner.nextInt();
                scanner.nextLine();
                Eletronico eletronicoEscolhido = eletronicos[index - 1];
                novaVenda.addLivro(eletronicoEscolhido, index);
                numEletronicos++;
                break;
            }
        }

        em.getTransaction().begin();
        em.persist(novaVenda);
        em.getTransaction().commit();

        vendas.add(novaVenda);

        System.out.println("Venda realizada com sucesso.");
        numVendas++;
    }

    public void listarLivros() {
        listarLivrosImpressos();
        listarLivrosEletronicos();
    }

    public void listarLivrosImpressos() {
        System.out.println("Tabela de Livros Impressos Cadastrados:");
        System.out.println("----------------------------------------------");
        System.out.println("   Índice   |   Título   |    Autores    |   Editora   |  Preço  |  Frete  | Estoque ");
        System.out.println("----------------------------------------------");

        for (int i = 1; i <= impressos.length; i++) {
            Impresso impresso = impressos[i - 1];
            if (impresso != null) {
                System.out.println(i + "      " + impresso);
            }
        }

        System.out.println("---------------------------------------------- \n");
    }

    public void listarLivrosEletronicos() {
        System.out.println("Tabela de Livros Eletrônicos Cadastrados:");
        System.out.println("----------------------------------------------");
        System.out.println("   ÍNDICE   |   Título   |    Autores    |   Editora   |  Preço  |  Tamanho (KB)  |");
        System.out.println("----------------------------------------------");

        for (int i = 1; i <= eletronicos.length; i++) {
            Eletronico eletronico = eletronicos[i - 1];
            if (eletronico != null) {
                System.out.println(i + "      " + eletronico);
            }
        }

        System.out.println("----------------------------------------------");
    }

    public void listarVendas() {
        if(!vendas.isEmpty()) {
            System.out.println("Vendas Realizadas:");
            for (Venda venda : vendas) {
                if(venda != null) {
                    System.out.println("Número da Venda: " + venda.getId());
                    System.out.println("Cliente: " + venda.getCliente());
                    System.out.println("Valor Total: R$" + venda.getValor());
                    System.out.println("--------------------------");
                }
            }

            System.out.printf("Número de Livros Impressos: %d%n", numImpressos);
            System.out.printf("Número de Livros Eletrônicos: %d%n", numEletronicos);
            System.out.printf("Número de Vendas: %d%n", numVendas);
        } else {
            System.out.println("Não há vendas realizadas.");
        }
    }


    public void obterDados(EntityManager em) {
        obterImpressos(em);
        obterEletronicos(em);
        obterVendas(em);
    }

    public void obterImpressos(EntityManager em) {
        TypedQuery<Impresso> queryImpressos = em.createQuery(
                "SELECT i FROM Impressos i", Impresso.class
        );
        List<Impresso> listaImpressos = queryImpressos.getResultList();

        if (!listaImpressos.isEmpty()) {
            numImpressos = listaImpressos.size();
            for (int i = 0; i < listaImpressos.size(); i++) {
                impressos[i] = listaImpressos.get(i);
            }
        } else {
            System.out.println("Não há impressos.");
        }
    }

    public void obterEletronicos(EntityManager em) {
        TypedQuery<Eletronico> queryEletronicos = em.createQuery(
                "SELECT e FROM Eletronicos e", Eletronico.class
        );
        List<Eletronico> listaEletronicos = queryEletronicos.getResultList();

        if (!listaEletronicos.isEmpty()) {
            numEletronicos = listaEletronicos.size();
            for (int i = 0; i < listaEletronicos.size(); i++) {
                eletronicos[i] = listaEletronicos.get(i);
            }
        } else {
            System.out.println("Não há livros eletrônicos.");
        }
    }

    public void obterVendas(EntityManager em) {
        TypedQuery<Venda> queryVendas = em.createQuery(
                "SELECT v FROM vendas v", Venda.class
        );
        List<Venda> listaVendas = queryVendas.getResultList();

        if (!listaVendas.isEmpty()) {
            System.out.println(listaVendas);
            numVendas = listaVendas.size();
            vendas = listaVendas;
        } else {
            System.out.println("A lista de resultados é maior do que o tamanho da lista 'vendas'.");
        }
    }


    public static void main(String[] args) {
        final EntityManager em = ConnectionFactory.getEntityManager();
        LivrariaVirtual livraria = new LivrariaVirtual();
        livraria.obterDados(em);

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;


        while (opcao != 5) {
            System.out.println("Menu:\n");
            System.out.println("1. Cadastrar livro");
            System.out.println("2. Realizar uma venda");
            System.out.println("3. Listar livros");
            System.out.println("4. Listar vendas");
            System.out.println("5. Sair do programa");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> livraria.cadastrarLivro();
                case 2 -> livraria.realizarVenda();
                case 3 -> livraria.listarLivros();
                case 4 -> livraria.listarVendas();
                case 5 -> {
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    return;
                }
                default -> {
                    System.out.println("Opção inválida. Escolha uma opção válida.");
                }
            }
        }
    }
}
