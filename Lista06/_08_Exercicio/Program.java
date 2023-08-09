
public class Program {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		Supervisor supervisor = new Supervisor();
		Vendedor vendedor = new Vendedor();
		
		System.out.printf("Comissão do Gerente: R$ %.2f%n", gerente.calcularComissao());
		System.out.printf("Comissão do Supervisor: R$ %.2f%n", supervisor.calcularComissao());
		System.out.printf("Comissão do Vendedor: R$ %.2f", vendedor.calcularComissao());
	}

}
