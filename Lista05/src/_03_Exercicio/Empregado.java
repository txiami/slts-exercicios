package _03_Exercicio;
import _01_Exercicio.Pessoa;

public class Empregado extends Pessoa {
	protected int codigoSetor;
	protected double salarioBase;
	protected double imposto;
	
	public Empregado() {
		
	}

	public Empregado(
			String nome, String endereco, String telefone,
			int codigoSetor, double salarioBase, double imposto
	) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	public Empregado(int codigoSetor, double salarioBase, double imposto) {
		super();
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public double calcularSalario() {
		return salarioBase -= salarioBase * imposto / 100;
	}
	
}
