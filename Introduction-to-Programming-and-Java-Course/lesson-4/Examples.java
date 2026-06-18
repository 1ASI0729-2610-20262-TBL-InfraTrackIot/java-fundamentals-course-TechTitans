public class Main {
   public class Main {
    public static void main(String[] args) {

        // Ejemplo 1: Contar del 1 al 10
        System.out.println("Contando del 1 al 10:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();

        // Ejemplo 2: Repetir mensaje
        System.out.println("Repitiendo mensaje:");

        for (int i = 1; i <= 3; i++) {
            System.out.println("Hola estudiante");
        }

        System.out.println();

        // Ejemplo 3: Tabla del 5
        System.out.println("Tabla del 5:");

        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        System.out.println();

        // Ejemplo 4: While
        System.out.println("Contando con while:");

        int numero = 1;

        while (numero <= 5) {
            System.out.println(numero);
            numero++;
        }
    }
}
}