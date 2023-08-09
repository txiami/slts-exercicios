package Lista06._10_Exercicio;

import Lista06._06_Exercicio.Funcionario;
import Lista06._06_Exercicio.FuncionarioEnsinoBasico;
import Lista06._06_Exercicio.FuncionarioEnsinoMedio;
import Lista06._06_Exercicio.FuncionarioGraduado;

import java.util.Random;

public class ImprimirPessoas {
    public static void main(String[] args) {
        Random random = new Random();
        Funcionario[] funcionarios = new Funcionario[10];

        int quantGerentes = 1;
        int quantSupervisores = 2;
        int quantVendedores = 7;

        for (int i = 0; i < quantGerentes; i++) {
            funcionarios[i] = new FuncionarioGraduado("Funcionario " + (i + 1), "CF" + (i + 1), "Escola Básica", "Escola Média", "Universidade");
        }

        for (int i = quantGerentes; i < quantGerentes + quantSupervisores; i++) {
            funcionarios[i] = new FuncionarioEnsinoMedio("Funcionario " + (i + 1), "CF" + (i + 1), "Escola Média", "Escola Básica");
        }

        for (int i = quantGerentes + quantSupervisores; i < quantGerentes + quantSupervisores + quantVendedores; i++) {
            funcionarios[i] = new FuncionarioEnsinoBasico("Funcionario " + (i + 1), "CF" + (i + 1), "Escola Básica");
        }

        double custoTotal = 0;
        double custoGerentes = 0;
        double custoSupervisores = 0;
        double custoVendedores = 0;

        for (Funcionario funcionario : funcionarios) {
            double rendaTotal = funcionario.getRendaTotal();
            custoTotal += rendaTotal;

            if (funcionario instanceof FuncionarioGraduado) {
                custoGerentes += rendaTotal;
            } else if (funcionario instanceof FuncionarioEnsinoMedio) {
                custoSupervisores += rendaTotal;
            } else if (funcionario instanceof FuncionarioEnsinoBasico) {
                custoVendedores += rendaTotal;
            }

            System.out.println(funcionario.toString() + ", Cargo: " + getCargo(funcionario));
        }

        System.out.println("\nCusto total da empresa: " + custoTotal);
        System.out.println("Custo total por cargo:");
        System.out.println("Gerente: " + custoGerentes);
        System.out.println("Supervisor: " + custoSupervisores);
        System.out.println("Vendedor: " + custoVendedores);
    }

    public static String getCargo(Funcionario funcionario) {
        if (funcionario instanceof FuncionarioGraduado) {
            return "Gerente";
        } else if (funcionario instanceof FuncionarioEnsinoMedio) {
            return "Supervisor";
        } else if (funcionario instanceof FuncionarioEnsinoBasico) {
            return "Vendedor";
        }
        return "Desconhecido";
    }
}
