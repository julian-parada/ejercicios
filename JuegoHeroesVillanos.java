// Clase base para personajes
abstract class Personaje {
    protected String nombre;
    protected int vida;
    protected int poder;

    public Personaje(String nombre, int vida, int poder) {
        this.nombre = nombre;
        this.vida = vida;
        this.poder = poder;
    }

    abstract void atacar(Personaje objetivo);

    public boolean estaVivo() {
        return vida > 0;
    }

    // Getters y setters
}

class Heroe extends Personaje {
    public Heroe(String nombre, int vida, int poder) {
        super(nombre, vida, poder);
    }

    @Override
    void atacar(Personaje objetivo) {
        int daño = this.poder;
        objetivo.vida -= daño;
        System.out.println(this.nombre + " ataca a " + objetivo.nombre + " y le causa " + daño + " de daño.");
    }
}

class Villano extends Personaje {
    public Villano(String nombre, int vida, int poder) {
        super(nombre, vida, poder);
    }

    @Override
    void atacar(Personaje objetivo) {
        int daño = this.poder * 2;  // Los villanos hacen más daño
        objetivo.vida -= daño;
        System.out.println(this.nombre + " ataca a " + objetivo.nombre + " y le causa " + daño + " de daño.");
    }
}

public class JuegoHeroesVillanos {
    public static void main(String[] args) {
        Heroe heroe = new Heroe("Superman", 100, 10);
        Villano villano = new Villano("Lex Luthor", 80, 8);

        while (heroe.estaVivo() && villano.estaVivo()) {
            heroe.atacar(villano);
            if (villano.estaVivo()) {
                villano.atacar(heroe);
            }
        }

        if (heroe.estaVivo()) {
            System.out.println("¡El héroe ha ganado!");
        } else {
            System.out.println("¡El villano ha ganado!");
        }
    }
}