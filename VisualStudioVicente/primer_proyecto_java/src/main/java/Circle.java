// Circle.java
package main.java;

import java.util.Scanner;



public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            calculateArea(scanner);
        } finally {
            scanner.close();
        }
    }


    public static void calculateArea(Scanner scanner) {
        System.out.println("Ingrese el radio del círculo: ");
        float radius = Float.parseFloat(scanner.nextLine());
        float area = (float) (Math.PI * radius * radius);
        System.out.println( "El área del círculo es: "+ area);
    }
}