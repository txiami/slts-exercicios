
public class ProgramaBanco {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.Cadastro(
                "000.000.000-00",
                "Thiago Sales",
                "Rua Carlos, 21",
                "2000"
        );

        Cliente cliente2 = new Cliente();
        cliente2.Cadastro(
                "100.000.000-00",
                "Maria",
                "Rua Jose, 100",
                "5005"
        );

        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123456";
        conta.tipo = "Conjunta";
        conta.primeiroTitular = cliente1;
        conta.segundoTitular = cliente2;
        conta.saldo = 100;
        conta.limiteTotal = 500;

        conta.credito(200.0);
        conta.debito(150.0);

        conta.resumo();
        }
    }


