package unl.edu.ec.goodCode;
import java.util.Scanner;

public class CalculadoraSuma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int primerNumero = solicitarNumero(scanner, "Ingrese el primer número:");
        int segundoNumero = solicitarNumero(scanner, "Ingrese el segundo número:");

        int resultadoSuma = sumarNumeros(primerNumero, segundoNumero);

        mostrarResultado(resultadoSuma);

        scanner.close();
    }

    public static int solicitarNumero(Scanner scanner, String mensaje) {
        System.out.println(mensaje);
        return scanner.nextInt();
    }

    public static int sumarNumeros(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static void mostrarResultado(int resultado) {
        System.out.println("La suma es: " + resultado);
    }
}
