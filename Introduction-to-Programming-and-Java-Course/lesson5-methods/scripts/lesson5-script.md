# Lección 5: Métodos

**Objetivo:** Aprender a crear bloques de código reutilizables para evitar repetir instrucciones y mantener nuestro programa ordenado.

## ¿Qué es un método?

Un método es como un "botón mágico" o una receta de cocina. Guardas un grupo de instrucciones dentro de él, le pones un nombre, y cada vez que necesitas ejecutar esas acciones, solo "presionas el botón" llamándolo por su nombre.

**En Java se escribe así:**

```java
public static void saludarUsuario(String nombre) {
    System.out.println("¡Hola " + nombre + "!");
}
```
Tiene tres partes esenciales:

1. **El tipo de retorno ( `void` ):** Le dice a Java si el método nos va a devolver un dato al terminar. `void` significa que solo realiza la acción (como mostrar un mensaje) y no devuelve nada.

2. **El nombre del método ( `saludarUsuario` ):** El término que eliges para identificar y llamar a tu método.

3. **Los parámetros ( `String nombre` ):** Son los ingredientes de entrada que el método necesita para trabajar.

### Elementos de un método

| Elemento | Para qué sirve | Ejemplo |
| :--- | :--- | :--- |
| **Tipo de Retorno** | Define qué tipo de dato entrega el método al finalizar. | `void` (nada), `int`, `double` |
| **Nombre** | Es el identificador único para invocar el bloque de código. | `calcularTotal`,<br>`mostrarMenu` |
| **Parámetros** | Variables que reciben los datos de entrada necesarios. | `(String producto, double precio)` |
| **Cuerpo del Método** | El bloque de instrucciones encerrado entre llaves `{ }`. | `System.out.println("Procesando...");` |

### Ejemplos del mundo real

```java
// 1. Sistema de una tienda: Calcular precio con impuesto (IGV)
public static void calcularTotal(double precioBase) {
    double impuesto = precioBase * 0.18;
    double precioFinal = precioBase + impuesto;
    System.out.println("Precio base: S/. " + precioBase);
    System.out.println("Precio final con IGV: S/. " + precioFinal);
}

// 2. Videojuego: Mostrar el estado de un jugador
public static void mostrarEstadoJugador(String clon, int vidas) {
    System.out.println("El jugador " + clon + " tiene " + vidas + " vidas restantes.");
}
```

## Conceptos clave

* El **tipo de retorno** determina si usarás la palabra clave `return` para enviar un dato de vuelta.
* El **nombre** del método se escribe en minúscula inicial y usando *camelCase* si tiene varias palabras (ej. `calcularNotaFinal` ).
* Los **parámetros** van dentro de los paréntesis `()` y se comportan como variables exclusivas del método.
* Usar métodos evita la duplicación de código y facilita corregir errores en un solo lugar.

## Práctica

Para esta lección, utilizaremos los archivos del repositorio para resolver los retos de automatización:

* `starter-files/Methods.java` : Completa las líneas marcadas con `___` para construir un método que sume dos números.
* `completed-examples/MethodsCompleted.java` : Código de verificación para comprobar que tus métodos funcionan de manera óptima.
* **Enlace para practicar:** [Abrir en JDoodle](https://www.jdoodle.com/ia/1UbX)
