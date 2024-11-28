// Clase base para personajes
public class Personaje {
    protected String nombre;
    protected short fuerza;
    protected short velocidad;
    protected short vida_hp;

    public Personaje(String nombre, short fuerza, short velocidad, short vida_hp) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.vida_hp = vida_hp;
    }

    public void atacar(Personaje oponente) {
        oponente.vida_hp -= this.fuerza;
    }

    public void defender(short daño) {
        this.vida_hp -= daño / 2;
    }

    public void mostrarEstadisticas() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Vida HP: " + vida_hp);
    }

    public void recuperarse() {
        // Método vacío para ser implementado por las subclases si es necesario
    }
}

// Clase para Superhéroes
class SuperHeroe extends Personaje {
    public SuperHeroe(String nombre, short fuerza, short velocidad, short vida_hp) {
        super(nombre, fuerza, velocidad, vida_hp);
    }

    @Override
    public void atacar(Personaje oponente) {
        super.atacar(oponente);
        System.out.println(nombre + " usó su ataque especial con fuerza de " + this.fuerza);
    }

    public void aumentarPoder() {
        this.fuerza += 10; // Incrementa la fuerza
        this.velocidad += 5; // Incrementa la velocidad
        System.out.println(nombre + " ha aumentado sus poderes: fuerza " + this.fuerza + " y velocidad " + this.velocidad);
    }

    @Override
    public void recuperarse() {
        if (Math.random() < 0.5) {
            this.vida_hp += 20; // Recupera 20 puntos de vida
            System.out.println(this.nombre + " se recuperó +20 de vida_hp");
        }
    }
}

// Clase para Villanos
class Villano extends Personaje {
    public Villano(String nombre, short fuerza, short velocidad, short vida_hp) {
        super(nombre, fuerza, velocidad, vida_hp);
    }

    @Override
    public void atacar(Personaje oponente) {
        super.atacar(oponente);
        System.out.println(nombre + " atacó a superhéroe con fuerza de " + this.fuerza);
        if (Math.random() > 0.5) { // 50% de probabilidad de hacer trampa
            oponente.vida_hp -= this.fuerza; // Duplica el daño
            System.out.println(nombre + " hizo trampa y duplicó su ataque!");
        }
    }

    @Override
    public void recuperarse() {
        if (Math.random() < 0.5) {
            this.vida_hp += 20; // Recupera 20 puntos de vida
            System.out.println(this.nombre + " se recuperó +20 de vida_hp");
        }
    }
}

// Clase principal para probar el programa
public class Principal {
    public static void main(String[] args) {
        SuperHeroe heroe = new SuperHeroe("Superman", 30, 20, 100);
        Villano villano = new Villano("Joker", 25, 15, 100);

        while (heroe.vida_hp > 0 && villano.vida_hp > 0) {
            heroe.atacar(villano);
            if (villano.vida_hp > 0) { // Villano solo ataca si está vivo
                villano.atacar(heroe);
            }
            heroe.mostrarEstadisticas();
            villano.mostrarEstadisticas();
            System.out.println("----------------------------");

            // Opción de recuperación y aumento de poder
            heroe.recuperarse();
            heroe.aumentarPoder();
            villano.recuperarse();
        }

        if (heroe.vida_hp <= 0) {
            System.out.println(villano.nombre + " ha ganado la batalla!");
        } else {
            System.out.println(heroe.nombre + " ha ganado la batalla!");
        }
    }
}
