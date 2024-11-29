import java.util.Scanner;

public class PositivoNegativoCero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el número al usuario
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        
        // Determinar si es positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }
}
