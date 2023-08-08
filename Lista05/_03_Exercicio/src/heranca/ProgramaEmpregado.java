package heranca;

public class ProgramaEmpregado {

	public static void main(String[] args) {
		Empregado empregado = new Empregado();
		empregado.setNome("Carl Sagan");
		empregado.setCodigoSetor(332);
		empregado.setSalarioBase(3200);
		empregado.setImposto(2);
		
		System.out.println("Nome: ");
		System.out.println(empregado.getNome());
		System.out.println("Código do Setor: ");
		System.out.println(empregado.getCodigoSetor());
		System.out.println("Salário líquido: ");
		System.out.println("R$ " + empregado.calcularSario());
	}

}
