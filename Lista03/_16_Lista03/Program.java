package Lista03._16_Lista03;

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
		
		if (dataValida) {
			System.out.println("A data é válida. O seu aniversário é em " + nomeMes + ", dia " + dia);
			System.out.println(trimestre);
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
}
