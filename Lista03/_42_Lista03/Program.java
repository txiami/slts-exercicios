package Lista03._42_Lista03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {

	public static void main(String[] args) {
		 Random gerador = new Random();
		 int totalGrupos = 40;
		 
		 System.out.println("Lista de grupos com números aleatórios: ");
		 
		 for (int i = 0; i < totalGrupos; i++) {
	            List<Integer> grupo = grupoNumeros(gerador);
	            System.out.print("Grupo " + (i + 1) + ": ");
	            for (int numero : grupo) {
	                System.out.print(numero + " ");
	            }
	            System.out.println();
	        }		 
	    }
	
	public static List<Integer> grupoNumeros(Random gerador){
		List<Integer> grupo = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
            grupo.add(gerador.nextInt(60));
        }
        grupo.sort(null);
        return grupo;
	}	
}