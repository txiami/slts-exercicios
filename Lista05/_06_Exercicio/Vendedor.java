public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    public Vendedor(
            String nome, String endereco, String telefone,
            int codigoSetor, double salarioBase, double imposto,
            double valorVendas, double comissao
    ) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        double baseSalary = getSalarioBase();
        double comissaoValor = (comissao / 100) * valorVendas;
        double salarioVendedor = baseSalary + comissaoValor;
        return salarioVendedor;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
