public class FuncionarioEnsinoMedio extends FuncionarioComEscolaridade {
	private String escolaridade;
    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, String escolaMedio, String escolaBasico) {
        super(nome, codigoFuncional, escolaBasico, escolaMedio, null);
        rendaBasica*=1.1;
        rendaBasica*=1.5;
    }
    
    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, String escolaridade, Comissao comissao) {
        super(nome, codigoFuncional, comissao);
        rendaBasica*=1.1;
        rendaBasica*=1.5;
        this.escolaridade = escolaridade;
    }
    
    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, String escolaridade) {
        super(nome, codigoFuncional);
        rendaBasica*=1.1;
        rendaBasica*=1.5;
        this.escolaridade = escolaridade;
    }
    
    public String getEscolaridade() {
        return escolaridade;
    }
    
    @Override
    public double calcularRendaTotal() {
    	return rendaBasica;
    }
}
