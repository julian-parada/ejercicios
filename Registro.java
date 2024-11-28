
import java.util.Scanner;
public class Registro {
    static class persona{
        String nombre;
        int edad;
        double peso;
        double estatura;

        public persona(String nombre, int edad, double peso, double estatura){
            this.nombre=nombre;
            this.edad=edad;
            this.peso=peso;
            this.estatura=estatura;
        }
        public String toString(){
            System.out.println("-----------------------------------------------------------------");
            System.out.println(nombre + " Tiene " + edad + " Años " + ", Tiene Un Peso De " + peso +" Kg" + " Y Su Estatura es de " + estatura + " cm");
            
            return nombre;
            
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuantas personas deseas registrar?");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        persona[] personas = new persona[cantidad];

        for (int i=0; i < personas.length; i++){

            System.out.println("/n personas ");

            System.out.println("ingrese el nombre: ");
            String nombre = scanner.nextLine();

            System.out.println("ingrese la edad: ");
            int edad = scanner.nextInt();

            System.out.println("ingrese el peso: ");
            double peso = scanner.nextDouble();

            System.out.println("ingrese la estatura: ");
            double estatura = scanner.nextDouble();
            scanner.nextLine();

            personas[i] = new persona(nombre, edad, peso, estatura);
            
        }

        System.out.println("/n personas registradas");
        for (persona p : personas){
            System.out.println(p);
        }
        scanner.close();


    }
    
     
    
}
