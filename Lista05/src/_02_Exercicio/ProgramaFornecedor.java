package _02_Exercicio;
import _01_Exercicio.Pessoa;

public class ProgramaFornecedor {
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("João");
        pessoa1.setEndereco("Rua A, 123");
        pessoa1.setTelefone("(11) 1234-5678");
        
        Pessoa pessoa2 = new Pessoa("Maria", "Av. B, 456", "(22) 9876-5432");
        
        System.out.println("Pessoa 1:");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Endereço: " + pessoa1.getEndereco());
        System.out.println("Telefone: " + pessoa1.getTelefone());
        
        System.out.println("\nPessoa 2:");
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Endereço: " + pessoa2.getEndereco());
        System.out.println("Telefone: " + pessoa2.getTelefone());
        
        
        System.out.println("");
        
        Fornecedor fornecedor = new Fornecedor("Fornecedor A", "Rua X, 789", "(11) 9999-8888", 2000, 1000);

        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());

        System.out.println("Valor de Crédito: " + fornecedor.getValorCredito());
        System.out.println("Valor da Dívida: " + fornecedor.getValorDivida());

        double saldo = fornecedor.obterSaldo();
        System.out.println("Saldo do Fornecedor: " + saldo);
        
    }
    
}
