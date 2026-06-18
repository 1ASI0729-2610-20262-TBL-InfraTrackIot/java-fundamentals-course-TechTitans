class Estudiante {
    String nombre;
    int edad;
    double notaFinal;

    // Constructor
    public Estudiante(String nombre, int edad, double notaFinal) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaFinal = notaFinal;
    }
}

public class StudentCompleted {
    public static void main(String[] args) {
        System.out.println("=== REPORTE ACADÉMICO ===");

        // Creación de objetos (Instanciación)
        Estudiante estudiante1 = new Estudiante("Juan", 15, 16.5);
        Estudiante estudiante2 = new Estudiante("María", 16, 10.0);

        // Imprimir los datos
        System.out.println("Alumno 1: " + estudiante1.nombre + " | Nota: " + estudiante1.notaFinal);
        System.out.println("Alumno 2: " + estudiante2.nombre + " | Edad: " + estudiante2.edad);
    }
}
