package _25_Lista03;


import java.util.Scanner;

public class ValidarHorario {
public static void main (String arg []) {
    Scanner input = new Scanner(System.in);
    System.out.print("Digite as Horas: ");
    byte horas = input.nextByte();
    System.out.print("Digite os minutos: ");
    byte minutos = input.nextByte();
    System.out.print("Digite os segundos: ");
    byte segundos = input.nextByte();

    if ( (horas < 24) && (minutos < 60) && (segundos < 60)){
        System.out.println("Horario Válido");
    }
    else{
        System.out.println("Horario Invalido");

    }


}
}
