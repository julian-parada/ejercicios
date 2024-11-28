import java.util.ArrayList;

public class Libro {
    protected String titulo;
    protected String autor;
    protected String isbn;
    protected String estado;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.estado = "disponible";
    }

    public boolean prestar() {
        if (estado.equals("disponible")) {
            estado = "prestado";
            return true;
        }
        return false;
    }

    public void devolver() {
        estado = "disponible";
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getEstado() {
        return estado;
    }
}

class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public boolean prestarLibro(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro.prestar();
            }
        }
        return false;
    }

    public int librosDisponibles() {
        int count = 0;
        for (Libro libro : libros) {
            if (libro.getEstado().equals("disponible")) {
                count++;
            }
        }
        return count;
    }
}

// Clase principal para probar el código
public class MiniBiblioteca {
    public static void main(String[] args) {
        // Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Crear algunos libros
        Libro libro1 = new Libro("Don Quijote", "Cervantes", "001");
        Libro libro2 = new Libro("Cien años de soledad", "García Márquez", "002");

        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Probar funcionalidades
        System.out.println("Libros disponibles: " + biblioteca.librosDisponibles()); // Debe mostrar 2
        biblioteca.prestarLibro("001");
        System.out.println("Libros disponibles después del préstamo: " + biblioteca.librosDisponibles()); // Debe mostrar 1
    }
}
