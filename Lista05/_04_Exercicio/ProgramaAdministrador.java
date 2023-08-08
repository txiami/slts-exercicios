package heranca;

public class ProgramaAdministrador {
    
    public static void main(String[] args) {
        Administrador administrador = new Administrador();
        administrador.setCodigoSetor(1);
        administrador.setSalarioBase(2000.0);
        administrador.setImposto(10.0);
        administrador.setAjudaDeCusto(300.0);

        System.out.println("Salário do administrador: " + administrador.calcularSalario());
    }
}