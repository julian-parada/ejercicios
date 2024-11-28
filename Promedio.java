
import java.util.Scanner;
public class Promedio {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;
        for (int i=0; i<numeros.length;i++){
            System.out.println("ingrese un numero");
            numeros[i] = scanner.nextInt();
            suma +=numeros[i];
            
        }
        System.out.println("los numeros ingresados fueron: ");
        for (int numero : numeros){
            System.out.println(numero);
        }
        double promedio = suma / 5;
        System.out.println("el resultado de la suma de los numeros ingresados es: " + suma);
        System.out.println("el resultado del promedio de los numeros ingresados es: " + promedio);
    }
}

