public class FuncionarioGraduado extends FuncionarioComEscolaridade {
    public FuncionarioGraduado(String nome, String codigoFuncional, String escolaBasico, String escolaMedio, String universidade) {
        super(nome, codigoFuncional, escolaBasico, escolaMedio, universidade);
        rendaBasica *= 1.10;
        rendaBasica *= 1.50;
        rendaBasica *= 2.00;
    }

    @Override
    public double calcularRendaTotal() {
        return rendaBasica;
    }
}
