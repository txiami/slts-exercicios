public class FuncionarioEnsinoMedio extends FuncionarioComEscolaridade {
    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, String escolaMedio, String escolaBasico) {
        super(nome, codigoFuncional, escolaBasico, escolaMedio, null);
        rendaBasica *= 1.10;
        rendaBasica *= 1.50;
    }

    @Override
    public double calcularRendaTotal() {
        return rendaBasica;
    }
}
