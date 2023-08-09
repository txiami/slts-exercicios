
public class Funcionario {
    private String nome;
    private String codigoFuncional;
    protected double rendaBasica = 1000.0;
    protected double rendaComissao;
    private Comissao comissao;

    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.rendaComissao = rendaBasica;
    }

    public Funcionario(String nome, String codigoFuncional, Comissao comissao) {
        this(nome, codigoFuncional);
        this.comissao = comissao;
        this.rendaComissao = comissao.getValor();
    }
    
    public double getRendaTotal() {
    	return rendaComissao + rendaBasica;
    }

    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoFuncional() {
		return codigoFuncional;
	}

	public void setCodigoFuncional(String codigoFuncional) {
		this.codigoFuncional = codigoFuncional;
	}

	public Comissao getComissao() {
		return comissao;
	}

	public void setComissao(Comissao comissao) {
		this.comissao = comissao;
	}

	public String toString() {
        return "Nome: " + nome + ", Código Funcional: " + codigoFuncional + ", Renda Total: " + getRendaTotal();
    }

}
