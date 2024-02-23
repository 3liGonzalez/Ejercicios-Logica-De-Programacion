import java.util.HashMap;
import java.util.Map;
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
        
          Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Ingrese una palabra en español (o 'salir' para terminar): ");
            String palabra = scanner.nextLine().toLowerCase();
            
            if (palabra.equals("salir")) {
                System.out.println("¡Hasta luego!");
                break;
            }
            
            if (diccionario.containsKey(palabra)) {
                String traduccion = diccionario.get(palabra);
                System.out.println("La traducción de '" + palabra + "' es '" + traduccion + "'.");
            } else {
                System.out.println("La palabra '" + palabra + "' no se encuentra en el diccionario.");
            }
        }
        
        scanner.close();
    }
}
