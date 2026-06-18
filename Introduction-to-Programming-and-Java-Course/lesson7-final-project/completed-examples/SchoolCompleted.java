class Estudiante {
    // 1. Atributos protegidos
    private String nombre;
    private double notaFinal;

    public Estudiante(String nombre, double notaFinal) {
        this.nombre = nombre;
        this.setNotaFinal(notaFinal); // Validando desde el nacimiento
    }

    // 2. Getters
    public String getNombre() {
        return this.nombre;
    }

    public double getNotaFinal() {
        return this.notaFinal;
    }

    // 3. Setter con regla de validación
    public void setNotaFinal(double nuevaNota) {
        if (nuevaNota >= 0 && nuevaNota <= 20) {
            this.notaFinal = nuevaNota;
        } else {
            System.out.println("Error: Nota inválida. Se asignará 0.");
            this.notaFinal = 0.0;
        }
    }
}

public class SchoolCompleted {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA AVANZADO DE NOTAS ===");
        
        // Array de objetos
        Estudiante[] salon = new Estudiante[3];

        salon[0] = new Estudiante("Renato", 14.5);
        salon[1] = new Estudiante("Lucía", 9.2);
        salon[2] = new Estudiante("Carlos", 18.0);

        // Bucle for y manipulación de Strings
        for (int i = 0; i < salon.length; i++) {
            Estudiante alumnoActual = salon[i];
            String nombreMayuscula = alumnoActual.getNombre().toUpperCase();
            
            if (alumnoActual.getNotaFinal() >= 11.0) {
                System.out.println("» " + nombreMayuscula + " APROBÓ con " + alumnoActual.getNotaFinal());
            } else {
                System.out.println("» " + nombreMayuscula + " DESAPROBÓ con " + alumnoActual.getNotaFinal());
            }
        }
        
        System.out.println("=================================");
    }
}
