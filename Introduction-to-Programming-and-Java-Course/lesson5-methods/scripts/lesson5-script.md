# Lección 5: Métodos

**Objetivo:** Aprender a crear bloques de código reutilizables para evitar repetir instrucciones y mantener nuestro programa ordenado.

## ¿Qué es un método?

Un método es como un "botón mágico" o una receta de cocina. Guardas un grupo de instrucciones dentro de él, le pones un nombre, y cada vez que necesitas ejecutar esas acciones, solo "presionas el botón" llamándolo por su nombre.

**En Java se escribe así:**

```java
public static void saludar(String nombre) {
    System.out.println("¡Hola " + nombre + "!");
}
