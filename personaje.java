package pullrequest;

import java.util.Random;

public class personaje {
    private String nom;
    private int dinero;
    private int nivel;
    
    // Constructor
    public personaje(String nom, int dinero) {
        this.nom = nom;
        this.dinero = dinero;
        this.nivel = 1; // Nivel inicial
    }
    
    // Mostrar información
    public void mostrarInfo() {
        System.out.println(nom + " tiene " + dinero + "$ y es nivel " + nivel + ".");
    }
    
    // Idea 1 — Método gastarDinero()
    public void gastarDinero(int cantidad, String enQue) {
        if (cantidad > dinero) {
            System.out.println(nom + " no tiene suficiente dinero.");
        } else {
            dinero -= cantidad;
            System.out.println(nom + " gasta " + cantidad + "$ en " + enQue + ".");
        }
    }

    // Idea 2 — Método subirNivel()
    public void subirNivel() {
        nivel++;
        System.out.println(nom + " sube al nivel " + nivel + " !");
    }

    // Idea 3 — Método cambiarNombre()
    public void cambiarNombre(String nuevoNombre) {
        System.out.println(nom + " ahora se llama " + nuevoNombre + ".");
        this.nom = nuevoNombre;
    }

    // Idea 4 — Método randomMission()
    public void randomMission() {
        String[] misiones = {
            "Entregar paquetes",
            "Capturar una bandera",
            "Recolectar recursos",
            "Rescatar a un aliado",
            "Eliminar a un objetivo",
            "Explorar una zona desconocida"
        };
        
        Random r = new Random();
        String mision = misiones[r.nextInt(misiones.length)];
        
        System.out.println(nom + " recibe una misión aleatoria: \"" + mision + "\".");
    }

    // MAIN
    public static void main(String[] args) {
        personaje jugador = new personaje("Trevor", 500);

        jugador.mostrarInfo();
        jugador.gastarDinero(100, "ropa nueva");
        jugador.subirNivel();
        jugador.cambiarNombre("Mike");
        jugador.randomMission();
    }
}
