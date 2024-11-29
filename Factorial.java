import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el número al usuario
        System.out.print("Introduce un número para calcular su factorial: ");
        int numero = scanner.nextInt();
        
        // Calcular el factorial y mostrar el resultado
        System.out.println("El factorial de " + numero + " es: " + factorial(numero));
    }
    
    // Función recursiva para calcular el factorial
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
