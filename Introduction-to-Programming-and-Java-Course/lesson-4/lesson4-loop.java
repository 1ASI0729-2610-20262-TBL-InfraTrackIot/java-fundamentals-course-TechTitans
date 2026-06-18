public class Main {
    public static void main(String[] args) {

        System.out.println("Contando del 1 al 10:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();

        System.out.println("Tabla del 5:");

        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        System.out.println();

        System.out.println("Contando con while:");

        int numero = 1;

        while (numero <= 5) {
            System.out.println(numero);
            numero++;
        }
    }
}