import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Crear el diccionario Español-Inglés
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("gato", "cat");
        diccionario.put("día", "day");
        diccionario.put("mundo", "world");
        diccionario.put("vida", "life");
        diccionario.put("bolsa", "bag");
        diccionario.put("trabajo", "job");
        diccionario.put("queso", "chesee");
        diccionario.put("nieve", "snow");
        diccionario.put("pollo", "cicken");
        diccionario.put("persona", "person");
        diccionario.put("piedra", "stone");
        diccionario.put("pastel", "cake");
        diccionario.put("mar", "sea");
        diccionario.put("nube", "cloud");
        diccionario.put("anillo", "ring");
        diccionario.put("amor", "love");
        diccionario.put("esperanza", "hope");
        diccionario.put("coraje", "courage");
        diccionario.put("confianza", "confidence");
        diccionario.put("libertda", "fredom");
        
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
