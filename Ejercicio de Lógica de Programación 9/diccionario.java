import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear el diccionario Español-Inglés
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("sol", "sun");
        diccionario.put("libro", "book");
        // Añade más palabras según sea necesario
        
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
