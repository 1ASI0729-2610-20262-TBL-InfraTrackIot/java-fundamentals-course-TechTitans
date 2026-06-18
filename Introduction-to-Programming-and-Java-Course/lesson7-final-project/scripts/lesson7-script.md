# Lección 7: Proyecto Final (POO, Arrays y Strings)

**Objetivo:** Proteger los datos de nuestros objetos, guardar múltiples registros usando estructuras de datos y manipular textos para crear un mini-sistema real.

---

## 1. Encapsulación (Protegiendo tus datos)

En la vida real, no dejas que un extraño abra tu mochila y altere tus cosas. En Java pasa lo mismo: no debemos dejar que cualquier parte del programa modifique los atributos de nuestros objetos directamente, porque podrían introducir datos erróneos (como una nota de -50).

Para protegerlos usamos la **Encapsulación**. Esto se logra en dos pasos:
1. Escondemos los atributos usando la palabra clave `private`.
2. Creamos "puertas seguras" llamadas **getters** y **setters**.

| Concepto | Función | Ejemplo |
|---|---|---|
| `private` | Bloquea el acceso directo al atributo desde el exterior. | `private double notaFinal;` |
| **Getter** | Método público para "leer" o ver el valor de forma segura. | `public double getNotaFinal()` |
| **Setter** | Método público para "modificar" el valor aplicando reglas o filtros. | `public void setNotaFinal(double nota)` |

**Así se ve en el código (El Molde):**

```java
class Estudiante {
    // 1. Datos privados (el candado de seguridad)
    private String nombre;
    private double notaFinal;

    // Constructor
    public Estudiante(String nombre, double notaFinal) {
        this.nombre = nombre;
        this.setNotaFinal(notaFinal); // Usamos el setter para validar desde el inicio
    }

    // 2. Getter (Permite ver el dato)
    public String getNombre() {
        return this.nombre;
    }

    public double getNotaFinal() {
        return this.notaFinal;
    }

    // 3. Setter (Permite modificar el dato usando reglas)
    public void setNotaFinal(double nuevaNota) {
        if (nuevaNota >= 0 && nuevaNota <= 20) { 
            this.notaFinal = nuevaNota;
        } else {
            System.out.println("Error: Nota inválida. Se asignará 0.");
            this.notaFinal = 0.0;
        }
    }
}
```

## 2. Arrays: Guardando múltiples objetos

Si tienes 50 alumnos, crear variables sueltas como `alumno1`, `alumno2` es imposible de mantener. Para eso usamos los **Arrays** (arreglos).

Un Array es una estructura de datos simple. Imagínalo como un estante con casilleros enumerados donde agrupamos una lista de objetos.

**Regla de oro:** ¡En programación siempre empezamos a contar los casilleros desde el cero ( `0` )!

## 3. Manipulación de Cadenas (Strings)

Los textos ( `String` ) en Java tienen herramientas ocultas. Puedes alterarlos fácilmente usando métodos que ya vienen integrados. Por ejemplo:

* `.toUpperCase()` : Convierte todo el texto a MAYÚSCULAS.
* `.toLowerCase()` : Convierte todo el texto a minúsculas.
* `.length()` : Te dice cuántas letras tiene el texto.

## 4. El Proyecto Final: Integrando todo

Vamos a crear nuestro estante (Array), llenarlo de estudiantes, y usar un bucle `for` para revisarlos todos de golpe.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA AVANZADO DE NOTAS ===");
        
        // 1. Instanciación de un Array (Un estante con 3 espacios)
        Estudiante[] salon = new Estudiante[3];

        // 2. Llenamos los casilleros del array
        salon[0] = new Estudiante("Renato", 14.5);
        salon[1] = new Estudiante("Lucía", 9.2);
        salon[2] = new Estudiante("Carlos", 18.0);

        // 3. Recorremos el Array automáticamente con un bucle
        for (int i = 0; i < salon.length; i++) {
            
            // Sacamos al estudiante del casillero actual temporalmente
            Estudiante alumnoActual = salon[i];
            
            // 4. Manipulación de cadenas: Convertimos a MAYÚSCULAS
            String nombreMayuscula = alumnoActual.getNombre().toUpperCase();
            
            // 5. Usamos el getter para evaluar la nota de forma segura
            if (alumnoActual.getNotaFinal() >= 11.0) {
                System.out.println("» " + nombreMayuscula + " APROBÓ con " + alumnoActual.getNotaFinal());
            } else {
                System.out.println("» " + nombreMayuscula + " DESAPROBÓ con " + alumnoActual.getNotaFinal());
            }
        }
        
        System.out.println("=================================");
    }
}
```

## Práctica

Para esta lección, utilizaremos los archivos del repositorio para trabajar con arreglos y encapsulación de datos académicos:

* `starter-files/School.java` : Instancia un arreglo de estudiantes, protégelos con encapsulación y utiliza un bucle para mostrar sus nombres modificados (en mayúsculas) por consola.
* `completed-examples/SchoolCompleted.java` : Proyecto final resuelto integrando arrays, getters, setters y manipulación de cadenas correctamente.
* **Enlace para practicar:** [Abrir en Jdoodle](https://www.jdoodle.com/ia/1Uc7)
