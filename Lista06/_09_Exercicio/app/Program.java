
public class Program {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		Supervisor supervisor = new Supervisor();
		Vendedor vendedor = new Vendedor();
	
		Funcionario funcionario = new Funcionario("Jorge", "3112");
		FuncionarioEnsinoBasico func2 = new FuncionarioEnsinoBasico("Carlos", "2112");
		FuncionarioEnsinoBasico func22 = new FuncionarioEnsinoBasico("Alex", "2132", "Ensino Básico", gerente);
		FuncionarioEnsinoMedio func3 = new FuncionarioEnsinoMedio("Jonas", "3442", "Ensino Médio");
		FuncionarioEnsinoMedio func33 = new FuncionarioEnsinoMedio("Douglas", "3242", "Ensino Médio", supervisor);
		FuncionarioGraduado func4 = new FuncionarioGraduado("Jozias", "2552", "Ensino Superior");
		FuncionarioGraduado func44 = new FuncionarioGraduado("Marcos", "2232", "Ensino Superior", vendedor);
		
		System.out.println();
		System.out.println("===============================================");
		System.out.println(funcionario.getNome() + ", Código " + funcionario.getCodigoFuncional() + ",  Renda Total: R$ " + funcionario.getRendaTotal());
		System.out.println(func2.getNome() + ", Código " + func2.getCodigoFuncional() + ", Escolaridade Ensino Básico" + ",  Renda Total: R$ " + func2.calcularRendaTotal());
		System.out.println("Gerente " + func22.getNome() + ", Código " + func22.getCodigoFuncional() + ", Escolaridade " + func22.getEscolaridade() + ",  Renda Total: R$ " + func22.getRendaTotal());
		System.out.println();
		System.out.println(func3.getNome() + ", Código " + func3.getCodigoFuncional() + ", Escolaridade " + func3.getEscolaridade() + ",  Renda Total: R$ " + func3.calcularRendaTotal());
		System.out.println("Supervisor "+func33.getNome() + ", Código " + func33.getCodigoFuncional() + ", Escolaridade " + func33.getEscolaridade() + ",  Renda Total: R$ " + func33.getRendaTotal());
		System.out.println();
		System.out.println(func4.getNome() + ", Código " + func4.getCodigoFuncional() + ", Escolaridade " + func4.getEscolaridade() + ",  Renda Total: R$ " + func4.calcularRendaTotal());
		System.out.println("Vendedor " + func44.getNome() + ", Código " + func44.getCodigoFuncional() + ", Escolaridade " + func44.getEscolaridade() + ",  Renda Total: R$ " + func44.getRendaTotal());
	}


}
