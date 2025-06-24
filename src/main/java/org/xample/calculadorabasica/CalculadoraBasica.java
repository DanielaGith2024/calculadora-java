/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.xample.calculadorabasica;

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;
        char operacion;

        System.out.println("=== Calculadora Básica en Java ===");

        System.out.print("Ingresa el primer número: ");
        num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        num2 = scanner.nextDouble();

        System.out.print("Selecciona la operación (+, -, *, /): ");
        operacion = scanner.next().charAt(0);

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("¡Error! No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
        }

        scanner.close();
    }
}
