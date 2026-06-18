# Lección 5: Clases y Objetos (POO)

**Objetivo:** Comprender las bases de la Programación Orientada a Objetos creando tus propios "moldes" de datos.

## ¿Qué es una Clase y un Objeto?

* **Clase:** Es el plano arquitectónico o el molde de fábrica. No es un objeto real, sino las instrucciones de cómo debe ser.
* **Objeto:** Es el producto real creado con el molde. Ocupa un lugar en la memoria y tiene sus propios datos independientes.

```java
// 1. El Molde
class Estudiante {
    String nombre;
    int edad;
    double notaFinal;

    // Constructor (Crea e inicializa al objeto)
    public Estudiante(String nombre, int edad, double notaFinal) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaFinal = notaFinal;
    }
}
```

## Anatomía de una Clase

| Componente | Para qué sirve | Ejemplo en el código |
| :--- | :--- | :--- |
| **Atributos** | Las características o variables internas del objeto. | `String nombre;` |
| **Constructor** | La función especial para dar vida al objeto al nacer. | `public Estudiante(...)` |
| **Palabra `this`** | Señala el atributo de este objeto específico para no confundirlo. | `this.edad = edad;` |

## El Mundo Real: Creando los Objetos

Para usar el molde dentro de nuestro programa principal (main), usamos la palabra clave new para dar la orden de fabricación:

```java
public class Main {
    public static void main(String[] args) {
        
        // Creamos dos objetos totalmente independientes usando el mismo molde
        Estudiante estudiante1 = new Estudiante("Juan", 15, 16.5);
        Estudiante estudiante2 = new Estudiante("María", 16, 10.0);

        // Accedemos a sus datos usando un punto (.)
        System.out.println("=== REPORTE ACADÉMICO ===");
        System.out.println("Alumno 1: " + estudiante1.nombre + " | Nota: " + estudiante1.notaFinal);
        System.out.println("Alumno 2: " + estudiante2.nombre + " | Nota: " + estudiante2.notaFinal);
    }
}
```

### Conceptos clave

* **La Clase es el concepto abstracto (`Estudiante`); el Objeto es el individuo real (`estudiante1`).**
* **La palabra clave `new`** es obligatoria para reservar espacio en la memoria de la computadora.
* **El operador punto (`.`)** es la llave para entrar a mirar o cambiar los atributos de un objeto (`objeto.atributo`).

### Practica

Para esta lección, utilizaremos los archivos del repositorio para trabajar con el molde de datos académicos:

- starter-files/Student.java : Agrega los métodos de acceso faltantes (getters y setters) en las zonas indicadas de la clase.
- completed-examples/StudentCompleted.java : Estructura completa de la clase resuelta con todas sus propiedades encapsuladas correctamente.
- **Enlace para practicar:** [Abrir en JDoodle](https://www.jdoodle.com/ia/1Uc0)
