package entity;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Entre Páginas e Sonhos",
                "Ana Martins e João Rodrigues",
                "Imaginação Literária",39.99f);


        Book book2 = new Book("Reflexos do Cosmos",
                "Sofia Ribeiro e Rafael Nascimento",
                "Universo Literário",49.99f);

        Book book3 = new Book("Sombras da Memória",
                "Lucas Ferreira e Marina Silva",
                "Universo Literário",34.99f);




        
        Venda venda1 = new Venda("Maria");
        venda1.addLivro(book1);
        venda1.addLivro(book2);

        Venda venda2 = new Venda("Fulano");
        venda2.addLivro(book1);
        venda2.addLivro(book2);
        venda2.addLivro(book3);


        venda1.listarLivros();
        System.out.println(venda1.valorTotal());
        System.out.println(venda1.getNumVendas());
        System.out.println(venda1.getCliente());

        System.out.println();

        venda2.listarLivros();
        System.out.println(venda2.valorTotal());
        System.out.println(venda2.getNumVendas());
        System.out.println(venda2.getCliente());



    }
}
