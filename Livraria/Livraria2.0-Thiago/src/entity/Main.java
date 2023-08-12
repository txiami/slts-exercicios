import entity.LivrariaVirtual;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LivrariaVirtual livraria = new LivrariaVirtual();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 5) {
            System.out.printf("Menu:\n\n");
            System.out.println("1. Cadastrar livro");
            System.out.println("2. Realizar uma venda");
            System.out.println("3. Listar livros");
            System.out.println("4. Listar vendas");
            System.out.println("5. Sair do programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    livraria.cadastrarLivro();
                    break;
                case 2:
                    livraria.realizarVenda();
                    break;
                case 3:
                    livraria.listarLivrosImpressos();
                    livraria.listarLivrosEletronicos();
                    break;
                case 4:
                    livraria.listarVendas();
                    break;
                case 5:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha uma opção válida.");
            }
        }

        scanner.close();
    }
}
