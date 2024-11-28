import java.util.Scanner;

public class DatosUsuario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Por favor, introduce tu edad: ");
        int edad = scanner.nextInt();

        System.out.print("Por favor, introduce tu altura en metros (ejemplo: 1,75): ");
        double altura = scanner.nextDouble();

        System.out.printf("Hola %s, tienes %d años y mides %.2f metros.%n", nombre, edad, altura);

        scanner.close();
    }
}
