package pullrequest;

public class personaje {
 private String nom;
 private int dinero;
 public personaje(String nom, int dinero) {
 this.nom = nom;
 this.dinero = dinero;
 }
 public void mostrarInfo() {
 System.out.println(nom + " tiene " + dinero + "$.");
 }
 public static void main(String[] args) {
 personaje jugador = new personaje("Trevor", 500);
 jugador.mostrarInfo();
 }
}