
public class FuncionarioGraduado extends FuncionarioComEscolaridade {
	private String escolaridade;
    public FuncionarioGraduado(String nome, String codigoFuncional, String escolaBasico, String escolaMedio, String universidade) {
        super(nome, codigoFuncional, escolaBasico, escolaMedio, universidade);
        rendaBasica*=1.1;
        rendaBasica*=1.5;
        rendaBasica*=2;
    }
    
    public FuncionarioGraduado(String nome, String codigoFuncional, String escolaridade, Comissao comissao) {
        super(nome, codigoFuncional, comissao);
        rendaBasica*=1.1;
        rendaBasica*=1.5;
        rendaBasica*=2;
        this.escolaridade = escolaridade;
    }
    
    public FuncionarioGraduado(String nome, String codigoFuncional, String escolaridade) {
        super(nome, codigoFuncional);
        rendaBasica*=1.1;
        rendaBasica*=1.5;
        rendaBasica*=2;
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
