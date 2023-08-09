package Lista06._10_Exercicio;

import Lista06._06_Exercicio.Funcionario;
import Lista06._06_Exercicio.FuncionarioEnsinoBasico;
import Lista06._06_Exercicio.FuncionarioEnsinoMedio;
import Lista06._06_Exercicio.FuncionarioGraduado;

public class ImprimirTodosFuncionarios {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        for (int i = 0; i < 4; i++) {
            funcionarios[i] =
                    new FuncionarioEnsinoBasico(
                            "Funcionario " + (i + 1),
                            "CF" + (i + 1),
                            "Escola Básica"
                    );
        }

        for (int i = 4; i < 8; i++) {
            funcionarios[i] =
                    new FuncionarioEnsinoMedio(
                            "Funcionario " + (i + 1),
                            "CF" + (i + 1),
                            "Escola Média",
                            "Escola Básica"
                    );
        }

        for (int i = 8; i < 10; i++) {
            funcionarios[i] =
                    new FuncionarioGraduado(
                            "Funcionario " + (i + 1),
                            "G" + (i + 1),
                            "Escola Básica",
                            "Escola Média",
                            "Universidade"
                    );
        }

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.toString());
        }
    }
}
