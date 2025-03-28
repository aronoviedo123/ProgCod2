package PracticaRecursividad;

import java.util.Scanner;

public class ej1 {

	// Método recursivo para calcular el n-ésimo número de Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Caso base: fibonacci(0) = 0, fibonacci(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Llamada recursiva
    }

    // Método para imprimir los primeros n números de la serie Fibonacci
    public static void imprimirFibonacci(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static void main(String[] args) {
        int n = 10; // Número de elementos en la serie Fibonacci que deseas mostrar
        System.out.println("Serie de Fibonacci hasta el " + n + "º término:");
        imprimirFibonacci(n);
    }


}
