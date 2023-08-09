public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor(
                "João", "Teste", "62986313627",
                1500, 10000, 5,
                2000, 12.5D
        );

        double salarioVendedor = vendedor.calcularSalario();

        System.out.println("Vendedor:");
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Salário Base: " + vendedor.getSalarioBase());
        System.out.println("Valor de Vendas: " + vendedor.getValorVendas());
        System.out.println("Comissão: " + vendedor.getComissao() + "%");
        System.out.println("Salário Total: " + salarioVendedor);
    }

}
