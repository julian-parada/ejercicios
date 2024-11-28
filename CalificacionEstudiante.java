import java.util.Scanner;
class Estudiante {
    // Atributos
    private String nombre;
    private String codigo;
    private double[] calificaciones;
    
    // Constructor
    public Estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.calificaciones = new double[3];
    }
    
    // Método para agregar calificacion
    public void agregarCalificacion(int posicion, double nota) {
        if (posicion >= 0 && posicion < 3) {
            calificaciones[posicion] = nota;
        } else {
            System.out.println("Posicion invalida");
        }
    }
    
    // Método para calcular promedio
    public double calcularPromedio() {
        double suma = 0;
        for (double nota : calificaciones) {
            suma += nota;
        }
        return suma / calificaciones.length;
    }
    
    // Método para verificar si aprobo
    public boolean aprobo() {
        return calcularPromedio() >= 6.0;
    }
    
    // Método para mostrar datos
    public void mostrarDatos() {
        System.out.println("\nDatos del Estudiante:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo: " + codigo);
        System.out.println("Calificaciones:");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Nota " + (i+1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + calcularPromedio());
        System.out.println("Estado: " + (aprobo() ? "Aprobado" : "Reprobado"));
    }
    
    // Getter para el nombre
    public String getNombre() {
        return nombre;
    }
}

public class CalificacionEstudiante {
    public static void main(String[] args) {

        // Crear estudiantes

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el nombre el estudiante 1");
        String nombre1 = scanner.nextLine();
        System.out.println("ingrese el nombre el estudiante 2");
        String nombre2 = scanner.nextLine();

        System.out.println("ingrese el codigo de " + nombre1);
        String codigo1 = scanner.nextLine();
        System.out.println("ingrese el codigo " + nombre2);
        String codigo2 = scanner.nextLine();

        System.out.println("ingrese la nota 1 de " + nombre1);
        double nota1 = scanner.nextDouble();
        System.out.println("ingrese la nota 2 de " + nombre1);
        Double nota2 = scanner.nextDouble();
        System.out.println("ingrese la nota 3 de " + nombre1);
        Double nota3 = scanner.nextDouble();
        System.out.println("ingrese la nota 1 de  " + nombre2);
        Double nota4 = scanner.nextDouble();
        System.out.println("ingrese la nota 2 de " + nombre2);
        Double nota5 = scanner.nextDouble();
        System.out.println("ingrese la nota 3 de " + nombre2);
        Double nota6 = scanner.nextDouble();











        Estudiante estudiante1 = new Estudiante(nombre1, codigo1);
        Estudiante estudiante2 = new Estudiante(nombre2, codigo2);
        
        // Agregar calificaciones estudiante 1
        estudiante1.agregarCalificacion(0, nota1);
        estudiante1.agregarCalificacion(1, nota2);
        estudiante1.agregarCalificacion(2, nota3);
        
        // Agregar calificaciones estudiante 2
        estudiante2.agregarCalificacion(0, nota4);
        estudiante2.agregarCalificacion(1, nota5);
        estudiante2.agregarCalificacion(2, nota6);
        
        // Mostrar datos de los estudiantes
        estudiante1.mostrarDatos();
        estudiante2.mostrarDatos();
        
        // Determinar mejor promedio
        if (estudiante1.calcularPromedio() > estudiante2.calcularPromedio()) {
            System.out.println("\nEl mejor promedio es de: " + estudiante1.getNombre());
        } else if (estudiante2.calcularPromedio() > estudiante1.calcularPromedio()) {
            System.out.println("\nEl mejor promedio es de: " + estudiante2.getNombre());
        } else {
            System.out.println("\nAmbos estudiantes tienen el mismo promedio");
        }
    }
}
