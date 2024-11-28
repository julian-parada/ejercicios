import java.util.Scanner;

public class OperacionesAritmeticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que introduzca dos numeros
        System.out.print("Ingrese el primer numero : ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo numero : ");
        double num2 = scanner.nextDouble();

        // Realizar las operaciones aritmeticas
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num2 != 0 ? num1 / num2 : Double.NaN; // Evitar division por cero
        double modulo = num2 != 0 ? num1 % num2 : Double.NaN;

        // Mostrar los resultados
        System.out.println("Suma : " + suma);
        System.out.println("Resta : " + resta);
        System.out.println("Multiplicación : " + multiplicacion);
        System.out.println("División : " + (num2 != 0 ? division : "No se puede dividir por cero"));
        System.out.println("Módulo : " + (num2 != 0 ? modulo : "No se puede calcular el módulo con divisor cero"));

        scanner.close();
    }
}
