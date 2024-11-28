//Pide un anio por teclado e indica si es bisiesto o no. 
//Un anio es bisiesto cuando es divisible entre 4 y no divisible por 100 o es divisible por 400
import java.util.Scanner;

public class anioBisisesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un anio");
        int anio = scanner.nextInt();
        if (anio % 4 == 0 && anio % 100 != 0) {
            System.out.println(" el anio " + anio + " es bisiesto ");

        } else {
            System.out.println(" el anio " + anio + " no es bisiesto ");
        }
    }
    
}