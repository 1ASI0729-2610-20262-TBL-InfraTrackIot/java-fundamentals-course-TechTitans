public class Main {
    public static void main(String[] args) {

        System.out.println("=== LECCION 3: IF Y ELSE ===");

        // Ejemplo 1: Edad para votar
        int edad = 20;

        if (edad >= 18) {
            System.out.println("Puedes votar");
        } else {
            System.out.println("Aún no puedes votar");
        }

        System.out.println();

        // Ejemplo 2: Nota de un estudiante
        int nota = 14;

        if (nota >= 11) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Desaprobado");
        }

        System.out.println();

        // Ejemplo 3: Videojuego
        int puntos = 120;

        if (puntos >= 100) {
            System.out.println("Ganaste la partida");
        } else {
            System.out.println("Sigue intentando");
        }

        System.out.println("\n=== LECCION 4: BUCLES ===");
    }
}