package heranca;

public class ProgramaEmpregado {

	public static void main(String[] args) {
		Empregado empregado = new Empregado();
		empregado.setNome("Carl Sagan");
		empregado.setCodigoSetor(332);
		empregado.setSalarioBase(3200);
		empregado.setImposto(2);
		
		System.out.print("Nome: ");
		System.out.println(empregado.getNome());
		System.out.print("\nCódigo do Setor: ");
		System.out.println(empregado.getCodigoSetor());
		System.out.print("\nSalário líquido: ");
		System.out.println("R$ " + empregado.calcularSalario());
	}

}
