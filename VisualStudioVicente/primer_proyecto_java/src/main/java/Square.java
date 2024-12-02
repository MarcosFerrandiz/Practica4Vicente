// Square.java
package main.java;

import java.util.Scanner;



public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            calculateArea(scanner);
        } finally {
            scanner.close();
        }
    }

    public static void calculateArea(Scanner scanner) {
        System.out.println("Ingrese el lado del cuadrado: ");
        float side = Float.parseFloat(scanner.nextLine());
        float area = side * side;
        System.out.println("El área del cuadrado es: "+ area);
    }
}