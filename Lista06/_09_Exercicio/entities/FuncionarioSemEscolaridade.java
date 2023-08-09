
public class FuncionarioSemEscolaridade extends Funcionario {
    public FuncionarioSemEscolaridade(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
    }
    
    public FuncionarioSemEscolaridade(String nome, String codigoFuncional, Comissao comissao) {
        super(nome, codigoFuncional, comissao);
    }
}