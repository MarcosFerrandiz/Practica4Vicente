// Triangle.java
package main.java;

import java.util.Scanner;



public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            calculateArea(scanner);
        } finally {
            scanner.close();
        }
    }
    
    public static void calculateArea(Scanner scanner) {
        System.out.println("Ingrese la base del triángulo: ");
        double base = Double.parseDouble(scanner.nextLine());
        System.out.println("Ingrese la altura del triángulo: ");
        double height = Double.parseDouble(scanner.nextLine());
        double area = 0.5 * base * height;
        System.out.println("El área del triángulo es: "+ area);
    }
}