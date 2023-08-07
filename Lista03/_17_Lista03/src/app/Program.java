package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número do dia e do mês do seu aniverário:");
		int dia = sc.nextInt();
		int mes = sc.nextInt();
		String nomeMes = "";
		sc.close();

		switch (mes) {
		case 1:
			nomeMes = "janeiro";
			break;
		case 2:
			nomeMes = "fevereiro";
			break;
		case 3:
			nomeMes = "março";
			break;
		case 4:
			nomeMes = "abril";
			break;
		case 5:
			nomeMes = "maio";
			break;
		case 6:
			nomeMes = "junho";
			break;
		case 7:
			nomeMes = "julho";
			break;
		case 8:
			nomeMes = "agosto";
			break;
		case 9:
			nomeMes = "setembro";
			break;
		case 10:
			nomeMes = "outubro";
			break;
		case 11:
			nomeMes = "novembro";
			break;
		case 12:
			nomeMes = "dezembro";
			break;
		default:
			System.out.println("valor inválido");
		}

		boolean dataValida = validarData(dia, mes);
		String trimestre = retornaTrimestre(mes);
		String signo = retornaSigno(dia, mes);
		
		if (dataValida) {
			System.out.println("A data é válida. O seu aniversário é em " + nomeMes + ", dia " + dia);
			System.out.println(trimestre);
			System.out.println("Signo: " + signo);
		} else {
			System.out.println("A data é inválida.");
		}
	}

	public static boolean validarData(int dia, int mes) {
		if (mes < 1 || mes > 12) {
			return false;
		} else if (dia < 1 || dia > 31) {
			return false;
		} else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
			return false;
		}else if (mes == 2) {
			if (dia > 28) {
				return false;
			}
		}
		return true;
	}
	
	public static String retornaTrimestre(int mes) {
        if (mes >= 1 && mes <= 3) {
            return "Nasceu no 1º trimestre";
        } else if (mes >= 4 && mes <= 6) {
            return "Nasceu no 2º trimestre";
        } else if (mes >= 7 && mes <= 9) {
            return "Nasceu no 3º trimestre";
        } else {
            return "Nasceu no 4º trimestre";
        }
    }
	
	public static String retornaSigno(int dia, int mes) {
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            return "Áries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            return "Touro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Gêmeos";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            return "Câncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            return "Leão";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgem";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpião";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitário";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            return "Capricórnio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            return "Aquário";
        } else {
            return "Peixes";
        }
    }
}
