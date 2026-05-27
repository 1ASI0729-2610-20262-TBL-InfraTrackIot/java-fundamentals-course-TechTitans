# Lección 1: Introducción a la Programación y Java

**Objetivo:** Comprender qué es programar, para qué sirve Java y escribir tu primer programa.

## ¿Qué es programar?

Programar es escribir instrucciones que una computadora puede entender y ejecutar.
Imagina que quieres hacer un sándwich — necesitas seguir pasos en orden:
pan, jamón, queso, pan. Un programa funciona igual: una lista de pasos que
la computadora sigue uno por uno.

Ejemplos de programas que usas todos los días:

- YouTube → muestra videos según lo que buscas
- WhatsApp → envía y recibe mensajes en tiempo real
- Minecraft → genera mundos y responde a tus acciones
- Google Maps → calcula la ruta más rápida hasta tu destino

**Idea clave:** Un programa es una secuencia de instrucciones escritas en un lenguaje
que la computadora entiende.

## ¿Qué es Java?

Java es uno de los lenguajes de programación más usados en el mundo.
Fue creado en 1995 y hoy se usa para construir:

- Aplicaciones Android (la mayoría de apps del Play Store)
- Sistemas bancarios y financieros
- Videojuegos como Minecraft
- Aplicaciones empresariales a gran escala

**¿Por qué aprender Java?**

- Es muy popular → hay muchísimos recursos y trabajos disponibles
- Funciona en cualquier computadora (Windows, Mac, Linux)
- Aprenderlo te da una base sólida para aprender otros lenguajes después

## Herramientas que usaremos

No necesitas instalar nada. Todo lo haremos desde el navegador:

- **Replit** → [https://replit.com](https://replit.com) — editor online gratuito
- **JDoodle** → [https://www.jdoodle.com](https://www.jdoodle.com) — alternativa rápida sin registro

Solo necesitas Chrome, Firefox, Safari o Edge. ¡Nada más!

## Tu primer programa en Java

Abre Replit o JDoodle y escribe esto:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
    }
}
```

Al ejecutarlo verás en pantalla:

Hola Mundo!

### ¿Qué significa cada parte?

| Parte | Qué hace |
|---|---|
| `public class Main` | Define el programa (la "caja" principal) |
| `public static void main` | El punto de inicio — por aquí empieza todo |
| `System.out.println(...)` | Imprime texto en pantalla |

> Por ahora no te preocupes por entender todo — lo iremos viendo lección a lección.

## Conceptos clave

- **Programa:** lista de instrucciones para la computadora
- **Java:** lenguaje de programación popular, potente y gratuito
- **`System.out.println()`:** la instrucción para mostrar texto en pantalla
- **No necesitas instalar nada** — todo funciona desde el navegador

## Práctica

Modifica el programa para que imprima tu nombre:

```java
System.out.println("Hola, soy Ana");
```

Luego prueba imprimir varias líneas:

```java
System.out.println("Hola Mundo");
System.out.println("Me llamo Ana");
System.out.println("Estoy aprendiendo Java");
```

- **Enlace para practicar:** [Abrir en JDoodle](https://www.jdoodle.com/online-java-compiler)