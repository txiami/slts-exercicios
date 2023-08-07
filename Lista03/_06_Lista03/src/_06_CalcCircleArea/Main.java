package _06_CalcCircleArea;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Com o raio de 5 metros, a area do circulo e: " + calcCircleArea(5));
        in.close();
    }

    private static double calcCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
