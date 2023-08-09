import java.util.Random;

public class Teste10Funcionarios {
    public static void main(String[] args) {
        Random random = new Random();
        Funcionario[] funcionarios = new Funcionario[10];

        for (int i = 0; i < 4; i++) {
            funcionarios[i] = new FuncionarioEnsinoBasico("Funcionario " + (i + 1), "CF" + (i + 1), "Escola Básica");
        }

        for (int i = 4; i < 8; i++) {
            funcionarios[i] = new FuncionarioEnsinoMedio("Funcionario " + (i + 1), "CF" + (i + 1), "Escola Média", "Escola Básica");
        }

        for (int i = 8; i < 10; i++) {
            funcionarios[i] = new FuncionarioGraduado("Funcionario " + (i + 1), "CF" + (i + 1), "Escola Básica", "Escola Média", "Universidade");
        }

        double custoTotal = 0;
        double custoBasico = 0;
        double custoMedio = 0;
        double custoSuperior = 0;

        for (Funcionario funcionario : funcionarios) {
            double rendaTotal = funcionario.getRendaTotal();
            custoTotal += rendaTotal;

            if (funcionario instanceof FuncionarioEnsinoBasico) {
                custoBasico += rendaTotal;
            } else if (funcionario instanceof FuncionarioEnsinoMedio) {
                custoMedio += rendaTotal;
            } else if (funcionario instanceof FuncionarioGraduado) {
                custoSuperior += rendaTotal;
            }

            System.out.println(funcionario.toString() + ", Escolaridade: " + getEscolaridade(funcionario) + ", Renda Total: " + rendaTotal);
        }

        System.out.println("\nCusto total da empresa: " + custoTotal);
        System.out.println("Custo total por nível de escolaridade:");
        System.out.println("Ensino Básico: " + custoBasico);
        System.out.println("Ensino Médio: " + custoMedio);
        System.out.println("Nível Superior: " + custoSuperior);
    }

    public static String getEscolaridade(Funcionario funcionario) {
        if (funcionario instanceof FuncionarioEnsinoBasico) {
            return "Ensino Básico";
        } else if (funcionario instanceof FuncionarioEnsinoMedio) {
            return "Ensino Médio";
        } else if (funcionario instanceof FuncionarioGraduado) {
            return "Nível Superior";
        }
        return "Desconhecido";
    }
}
