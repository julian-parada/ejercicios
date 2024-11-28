import java.util.Scanner;

public class PromedioNumeros {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Declarar un array de tamaño 5
        double[] numeros = new double[5];

        // Solicitar al usuario que ingrese los números
        System.out.println("Introduce 5 números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        // Calcular la suma de los números
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }

        // Calcular el promedio
        double promedio = suma / numeros.length;

        // Mostrar el promedio
        System.out.printf("El promedio de los números es: %.2f%n", promedio);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
