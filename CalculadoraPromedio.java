package unl.edu.ec.goodCode;
import java.util.Scanner;

public class CalculadoraPromedio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double primeraNota = solicitarNota(scanner, "Ingrese la primera nota:");
        double segundaNota = solicitarNota(scanner, "Ingrese la segunda nota:");
        double terceraNota = solicitarNota(scanner, "Ingrese la tercera nota:");

        double promedioFinal = calcularPromedio(
                primeraNota,
                segundaNota,
                terceraNota
        );

        mostrarPromedio(promedioFinal);
        scanner.close();
    }

    public static double solicitarNota(Scanner scanner, String mensaje) {
        System.out.println(mensaje);
        return scanner.nextDouble();
    }

    public static double calcularPromedio(
            double nota1,
            double nota2,
            double nota3
    ) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public static void mostrarPromedio(double promedio) {

        System.out.println("El promedio final es: " + promedio);

        if (promedio >= 7) {
            System.out.println("Estado: Aprobado");
        } else {
            System.out.println("Estado: Reprobado");
        }
    }
}