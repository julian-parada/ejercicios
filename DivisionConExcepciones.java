import java.util.Scanner;

public class DivisionConExcepciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar los números al usuario
        System.out.print("Introduce el numerador: ");
        int numerador = scanner.nextInt();
        
        System.out.print("Introduce el denominador: ");
        int denominador = scanner.nextInt();
        
        try {
            // Intentar hacer la división
            int resultado = numerador / denominador;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        }
    }
}
