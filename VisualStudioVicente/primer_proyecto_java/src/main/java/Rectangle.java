// Rectangle.java
package main.java;

import java.util.Scanner;



public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            calculateArea(scanner);
        } finally {
            scanner.close();
        }
    }

    public static void calculateArea(Scanner scanner) {
        System.out.println("Ingrese la base del rectángulo: ");
        float base = Float.parseFloat(scanner.nextLine());
        System.out.println("Ingrese la altura del rectángulo: ");
        float height = Float.parseFloat(scanner.nextLine());
        float area = (float) (base * height);
        System.out.println("El área del rectángulo es: "+ area);
    }
}