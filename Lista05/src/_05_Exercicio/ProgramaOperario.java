package _05_Exercicio;

public class ProgramaOperario {

	public static void main(String[] args) {
		Operario operario = new Operario();
		operario.setNome("Albert Einstein");
		operario.setCodigoSetor(352);
		operario.setSalarioBase(3200);
		operario.setImposto(2);
		operario.setValorProducao(5000);
		operario.setComissao(3);
		

		System.out.print("Nome: ");
		System.out.println(operario.getNome());
		System.out.print("\nCódigo do Setor: ");
		System.out.println(operario.getCodigoSetor());
		System.out.println("\nValor de produção: R$ " + operario.getValorProducao());
		System.out.print("\nSalário líquido: ");
		System.out.println("R$ " + operario.calcularSalario());
	}

}
