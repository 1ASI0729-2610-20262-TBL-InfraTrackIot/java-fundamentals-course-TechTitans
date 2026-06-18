public class MethodsCompleted {
    
    // 1. Definición del método
    public static void saludarUsuario(String nombre, int edad) {
        System.out.println("¡Hola, " + nombre + "!");
        System.out.println("Vemos que tienes " + edad + " años.");
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        System.out.println("--- Inicio del Programa ---");
        
        // Llamadas al método
        saludarUsuario("Carlos", 15);
        saludarUsuario("Sofía", 17);
        saludarUsuario("Mateo", 13);

        System.out.println("--- Fin del Programa ---");
    }
}
