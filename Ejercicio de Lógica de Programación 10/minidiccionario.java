import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Crear el diccionario Español-Inglés
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("agua", "water");
        diccionario.put("árbol", "tree");
        diccionario.put("coche", "car");
        diccionario.put("manzana", "apple");
        diccionario.put("computadora", "computer");
        diccionario.put("libro", "book");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("pelota", "ball");
        diccionario.put("ventana", "window");
        diccionario.put("puerta", "door");
        diccionario.put("reloj", "clock");
        diccionario.put("zapato", "shoe");
        diccionario.put("camisa", "shirt");
        diccionario.put("pantalón", "pants");
        
        // Seleccionar 5 palabras al azar
        String[] palabrasEspañol = diccionario.keySet().toArray(new String[0]);
        Random random = new Random();
        String[] palabrasSeleccionadas = new String[5];
        for (int i = 0; i < 5; i++) {
            palabrasSeleccionadas[i] = palabrasEspañol[random.nextInt(palabrasEspañol.length)];
        }
        
        // Pedir al usuario que ingrese las traducciones y verificarlas
        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;
        for (String palabra : palabrasSeleccionadas) {
            System.out.println("¿Cuál es la traducción de '" + palabra + "'?");
            String traduccion = scanner.nextLine();
            if (traduccion.equalsIgnoreCase(diccionario.get(palabra))) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto. La traducción correcta es: " + diccionario.get(palabra));
                respuestasIncorrectas++;
            }
        }
        
        // Mostrar el resultado
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
        
        scanner.close();
    }

}
