import java.util.Scanner;

public class ComparacionNumeros {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double numero3 = scanner.nextDouble();

        if (numero1 > numero2 && numero1 < numero3) {
            System.out.println("El primer número es mayor que el segundo y menor que el tercero.");
        } else {
            System.out.println("El primer número NO cumple la condición de ser mayor que el segundo y menor que el tercero.");
        }

        scanner.close();
    }
}

