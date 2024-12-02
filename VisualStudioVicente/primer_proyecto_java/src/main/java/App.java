package main.java;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Calculadora de Área por Marcos")
            System.out.println("Seleccione una opción")
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triángulo");
            System.out.println("4. Rectángulo");
            System.out.println("5. Pentágono");
            System.out.println("6. Trapecio");
            System.out.println("0. Salir");
            System.out.println("Opción: ");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    Circle.calculateArea(scanner);
                    break;
                case 2:
                    Square.calculateArea(scanner);
                    break;
                case 3:
                    Triangle.calculateArea(scanner);
                    break;
                case 4:
                    Rectangle.calculateArea(scanner);
                    break;
                case 5:
                    Pentagon.calculateArea(scanner);
                    break;
                case 6:
                    Trapecio.calculateArea(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (option != 0);  
        scanner.close();
    }
}
