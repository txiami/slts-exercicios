public class Funcionario {
    private String nome, codigoFuncional;
    protected double rendaBasica = 1000.0, comissao = 0.0;

    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        getComissao();
    }

    public double getRendaTotal() {
        return rendaBasica + comissao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                ", comissão: " + comissao +
                ", Renda Total: " + getRendaTotal();
    }

    public double getComissao() {
        if (this instanceof FuncionarioEnsinoBasico) {
            this.comissao = 250.0;
        } else if (this instanceof FuncionarioEnsinoMedio) {
            this.comissao = 600.0;
        } else if (this instanceof FuncionarioGraduado) {
            this.comissao = 1500.0;
        }
        return 0.0;
    }
}
