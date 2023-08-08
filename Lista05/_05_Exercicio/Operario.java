package heranca;

public class Operario extends Empregado{
	double valorProducao;
	double comissao;
	
	public Operario() {
		
	}

	public Operario(double valorProducao, double comissao) {
		super();
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double calcularSalarioOpe() {
		return calcularSario() + valorProducao*comissao/100;
	}
}
