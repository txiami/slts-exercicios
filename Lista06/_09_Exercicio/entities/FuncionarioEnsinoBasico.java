public class FuncionarioEnsinoBasico extends FuncionarioComEscolaridade{
	private String escolaridade;
	
    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, String escolaBasico) {
        super(nome, codigoFuncional, escolaBasico, null, null);
        rendaBasica*=1.1;
    }
    
    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, String escolaridade, Comissao comissao) {
        super(nome, codigoFuncional, comissao);
        this.escolaridade = escolaridade;
        rendaBasica*=1.1;
    }
    
    public FuncionarioEnsinoBasico(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
        rendaBasica*=1.1;
    }
    public String getEscolaridade() {
        return escolaridade;
    }
    
    @Override
    public double calcularRendaTotal() {      
    	return rendaBasica;
    }
    
 
}
