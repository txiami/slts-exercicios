public class Funcionario {
    private String nome;
    private String codigoFuncional;
    protected double rendaBasica = 1000.0;

    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }

    public double getRendaTotal() {
        return rendaBasica;
    }

    public String toString() {
        return "Nome: " + nome + ", Código Funcional: " + codigoFuncional + ", Renda Total: " + getRendaTotal();
    }
}
