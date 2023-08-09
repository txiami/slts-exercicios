import java.util.Scanner;

public class TesteManual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o código funcional do funcionário: ");
        String codigoFuncional = scanner.nextLine();

        System.out.println("Escolha o tipo de escolaridade:");
        System.out.println("1 - Funcionário Sem Escolaridade");
        System.out.println("2 - Funcionário Ensino Básico");
        System.out.println("3 - Funcionário Ensino Médio");
        System.out.println("4 - Funcionário Graduado");
        System.out.print("Opção: ");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        Funcionario funcionario = null;

        switch (escolha) {
            case 1:
                funcionario = new FuncionarioSemEscolaridade(nome, codigoFuncional);
                break;
            case 2:
                System.out.print("Digite a escola do ensino básico do funcionário: ");
                String escolaBasico = scanner.nextLine();
                funcionario = new FuncionarioEnsinoBasico(nome, codigoFuncional, escolaBasico);
                break;
            case 3:
                System.out.print("Digite a escola do ensino médio do funcionário: ");
                String escolaMedio = scanner.nextLine();
                System.out.print("Digite a escola do ensino básico do funcionário: ");
                String escolaBasicoMedio = scanner.nextLine();
                funcionario = new FuncionarioEnsinoMedio(nome, codigoFuncional, escolaMedio, escolaBasicoMedio);
                break;
            case 4:
                System.out.print("Digite a universidade do funcionário graduado: ");
                String universidade = scanner.nextLine();
                System.out.print("Digite a escola do ensino médio do funcionário graduado: ");
                String escolaMedioGraduado = scanner.nextLine();
                System.out.print("Digite a escola do ensino básico do funcionário graduado: ");
                String escolaBasicoGraduado = scanner.nextLine();
                funcionario = new FuncionarioGraduado(nome, codigoFuncional, escolaBasicoGraduado, escolaMedioGraduado, universidade);
                break;
            default:
                System.out.println("Escolha inválida.");
                break;
        }


        System.out.println("\nInformações do Funcionário:\n");
        System.out.println(funcionario);

        if (funcionario instanceof FuncionarioComEscolaridade) {
            FuncionarioComEscolaridade funcionarioComEscolaridade = (FuncionarioComEscolaridade) funcionario;
            System.out.println("Escola do Ensino Básico: " + funcionarioComEscolaridade.getEscolaBasico());

            if (funcionarioComEscolaridade.possuiEscolaridade()) {
                String escolaMedio = funcionarioComEscolaridade.getEscolaMedio();
                if (escolaMedio != null) {
                    System.out.println("Escola do Ensino Médio: " + escolaMedio);
                }

                String universidade = funcionarioComEscolaridade.getUniversidade();
                if (universidade != null) {
                    System.out.println("Universidade: " + universidade);
                }
            }
        }

        scanner.close();
    }
}
