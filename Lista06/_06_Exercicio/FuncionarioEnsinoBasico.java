public class FuncionarioEnsinoBasico extends FuncionarioComEscolaridade {
    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, String escolaBasico) {
        super(nome, codigoFuncional, escolaBasico, null, null);
        rendaBasica *= 1.10;
    }

    @Override
    public double calcularRendaTotal() {
        return rendaBasica;
    }
}
