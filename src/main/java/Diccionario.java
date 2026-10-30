import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {

    public static void main(String[] args) {

        // Creamos el diccionario Español - Inglés
        HashMap<String, String> diccionario = new HashMap<>();

        // Agregamos 20 palabras con su traducción
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("libro", "book");
        diccionario.put("agua", "water");
        diccionario.put("manzana", "apple");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("escuela", "school");
        diccionario.put("amigo", "friend");
        diccionario.put("familia", "family");
        diccionario.put("comida", "food");
        diccionario.put("ventana", "window");
        diccionario.put("puerta", "door");
        diccionario.put("coche", "car");
        diccionario.put("libertad", "freedom");
        diccionario.put("feliz", "happy");
        diccionario.put("novio", "boyfriend");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("cabello", "hair");
        diccionario.put("ojos", "eyes");
        diccionario.put("colores", "colors");

        // Creamos una lista con las palabras del diccionario
        ArrayList<String> palabras = new ArrayList<>(diccionario.keySet());

        Collections.shuffle(palabras); // Mezclamos las palabras para obtener un orden aleatorio
        Scanner scanner = new Scanner(System.in); // Creamos el Scanner para leer las respuestas

        // Variables para contar los resultados buenos y malos
        int correctas = 0;
        int incorrectas = 0;

        System.out.println("===== MINI DICCIONARIO ESPAÑOL - INGLÉS =====");
        System.out.println("Instrucciones: ");
        System.out.println("Escribe la traducción al inglés de las siguientes palabras.");
        System.out.println();

        for (int i = 0; i < 5; i++) { // Recorremos solamente las primeras 5 palabras

            String palabra = palabras.get(i); // Obtenemos la palabra en español

            System.out.print((i + 1) + ". " + palabra + ": "); // Pedimos al usuario su traducción
            String respuesta = scanner.nextLine().trim();
            String traduccion = diccionario.get(palabra); // Obtenemos la traducción correcta del diccionario

            if (respuesta.equalsIgnoreCase(traduccion)) { // Comparamos la respuesta del usuario con la traducción
                System.out.println("¡Correcto!");
                correctas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + traduccion);
                incorrectas++;
            }
            System.out.println();
        }

        // Mostramos el resultado final
        System.out.println("===== RESULTADOS FINALES =====");
        System.out.println("Respuestas correctas: " + correctas);
        System.out.println("Respuestas incorrectas: " + incorrectas);
        scanner.close(); // Cerramos el Scanner
    }
}
