package main.java;

import java.util.Scanner;



public class Trapecio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            calculateArea(scanner);
        } finally {
            scanner.close();
        }
    }
    
    public static void calculateArea(Scanner scanner) {
        System.out.println("Ingrese la base mayor del trapecio: ");
        float baseMayor = Float.parseFloat(scanner.nextLine());
        System.out.println("Ingrese la base menor del trapecio: ");
        float baseMenor = Float.parseFloat(scanner.nextLine());
        System.out.println("Ingrese la altura del trapecio: ");
        float altura = Float.parseFloat(scanner.nextLine());
        float area = (baseMayor + baseMenor)/ 2 * altura;
        System.out.println( "El área del trapecio es: "+ area);
    }
}