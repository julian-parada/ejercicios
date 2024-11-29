class Coche {
    // Atributos de la clase Coche
    String marca;
    String modelo;
    int año;
    
    // Constructor
    public Coche(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    
    // Método para mostrar los detalles del coche
    public void mostrarDetalles() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Coche
        Coche miCoche = new Coche("Toyota", "Corolla", 2020);
        
        // Mostrar los detalles del coche
        miCoche.mostrarDetalles();
    }
}
