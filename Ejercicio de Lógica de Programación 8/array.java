import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        
        // Solicitar al usuario 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = scanner.nextInt();
        }
        
        // Mostrar el array original
        System.out.println("Array original mostrando la posición del array más el valor:");
        mostrarArrayConIndice(numeros);
        
        // Mover números primos al principio del array
        moverPrimosAlPrincipio(numeros);
        
        // Mostrar el array con los números primos al principio
        System.out.println("Array con los números primos en las primeras posiciones, mostrando la posición del array más el valor:");
        mostrarArrayConIndice(numeros);
    }
    
    // Función para mostrar un array con índices
    public static void mostrarArrayConIndice(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " - " + array[i]);
        }
    }
    
    // Función para mover los números primos al principio del array
    public static void moverPrimosAlPrincipio(int[] array) {
        int index = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (esPrimo(array[i])) {
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
                index++;
            }
        }
    }
    
    // Función para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
