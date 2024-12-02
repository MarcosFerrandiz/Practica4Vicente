// Pentagon.java
package main.java;

import java.util.Scanner;


public class Pentagon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            calculateArea(scanner);
        } finally {
            scanner.close();
        }
    }
    public static void calculateArea(Scanner scanner) {
        System.out.println("Ingrese el lado del pentágono: ");
        float side = Float.parseFloat(scanner.nextLine());
        System.out.println("Ingrese la apotema del pentágono: ");
        float apothem = Float.parseFloat(scanner.nextLine());
        float area = (float) (0.5 * 5 * side * apothem);
        System.out.println("El área del pentágono es: "+ area);
    }
}