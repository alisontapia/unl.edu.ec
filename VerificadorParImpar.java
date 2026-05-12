package unl.edu.ec.goodCode;

import java.util.Scanner;

public class VerificadorParImpar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroIngresado = obtenerNumero(scanner);
        mostrarResultado(numeroIngresado);
        scanner.close();
    }

    public static int obtenerNumero(Scanner scanner) {
        System.out.println("Ingrese un número:");
        return scanner.nextInt();
    }

    public static boolean esNumeroPar(int numero) {
        return numero % 2 == 0;
    }

    public static void mostrarResultado(int numero) {

        if (esNumeroPar(numero)) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }
}