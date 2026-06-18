class Estudiante {
    // TODO: 1. Agrega la palabra 'private' a estos atributos
    String nombre;
    double notaFinal;

    public Estudiante(String nombre, double notaFinal) {
        this.nombre = nombre;
        // TODO: 4. Cambia esta línea para usar el setter en lugar de acceder directamente
        this.notaFinal = notaFinal; 
    }

    // TODO: 2. Crea los Getters para 'nombre' y 'notaFinal'
    

    // TODO: 3. Crea el Setter para 'notaFinal' (Asegúrate de que solo acepte notas de 0 a 20)
    
}

public class School {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA AVANZADO DE NOTAS ===");
        
        // TODO: 5. Crea un Array llamado 'salon' con espacio para 3 Estudiantes
        

        // TODO: 6. Llena las posiciones [0], [1] y [2] del Array con objetos Estudiante
        

        // TODO: 7. Crea un bucle for para recorrer el Array.
        // Dentro del bucle:
        // - Obtén el nombre y conviértelo a mayúsculas con .toUpperCase()
        // - Usa un if con el getter de la nota para evaluar si aprobó (>= 11.0)
        
        
        System.out.println("=================================");
    }
}
