import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] diasSemana = {"lunes", "martes", "miércoles", "jueves", "viernes"};
        int[] minutosPorDia = {0, 1440, 2880, 4320, 5760}; // Minutos hasta el fin de semana desde el lunes
        
        String diaSemana;
        int hora, minutos;
        
        do {
            System.out.print("Ingrese un día de la semana (de lunes a viernes): ");
            diaSemana = scanner.nextLine().toLowerCase();
        } while (!validarDiaSemana(diaSemana, diasSemana));
        
        do {
            System.out.print("Ingrese una hora (0-23): ");
            hora = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
        } while (hora < 0 || hora > 23);
        
        do {
            System.out.print("Ingrese los minutos (0-59): ");
            minutos = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
        } while (minutos < 0 || minutos > 59);
        
        int minutosHastaFinSemana = calcularMinutosHastaFinSemana(diaSemana, minutosPorDia) - ((hora * 60) + minutos);
        
        if (minutosHastaFinSemana < 0) {
            minutosHastaFinSemana = 0; // Si ya pasó el fin de semana
        }
        
        System.out.println("Faltan " + minutosHastaFinSemana + " minutos para el fin de semana.");
    }
    
    public static boolean validarDiaSemana(String dia, String[] diasValidos) {
        for (String diaValido : diasValidos) {
            if (diaValido.equals(dia)) {
                return true;
            }
        }
        System.out.println("Día de la semana no válido. Inténtelo de nuevo.");
        return false;
    }
    
    public static int calcularMinutosHastaFinSemana(String dia, int[] minutosPorDia) {
        switch (dia) {
            case "lunes":
                return minutosPorDia[0];
            case "martes":
                return minutosPorDia[1];
            case "miércoles":
                return minutosPorDia[2];
            case "jueves":
                return minutosPorDia[3];
            case "viernes":
                return minutosPorDia[4];
            default:
                return 0; // En caso de error
        }
    }
}
