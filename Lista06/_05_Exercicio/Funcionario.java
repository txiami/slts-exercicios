public class Funcionario {
    private String nome;
    private String codigoFuncional;

    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }

    public String toString() {
        return "Nome: " + nome + ", Código Funcional: " + codigoFuncional;
    }
}
