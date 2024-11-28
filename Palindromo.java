import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número:");

        try {
            String num = scanner.nextLine();
            int nuvNum = Integer.parseInt(num);
            String numeroComoString = Integer.toString(nuvNum);

            String alreves = new StringBuilder(numeroComoString).reverse().toString();

            if (numeroComoString.equals(alreves)) {
                System.out.println("El número " + num + " es un palíndromo.");
            } else {
                System.out.println("El número " + num + " no es un palíndromo.");
            }
        } catch (NumberFormatException e) {
            System.out.println("¡Error! Por favor, ingrese un número válido.");
        }

        scanner.close();
    }
}



