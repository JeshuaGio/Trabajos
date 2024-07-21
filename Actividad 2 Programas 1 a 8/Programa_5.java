import java.util.Scanner;

public class EstacionAño {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número de mes
        System.out.print("Ingresa el número de mes (1-12): ");
        int numeroMes = scanner.nextInt();

        // Determinar la estación del año usando switch
        String estacion = determinarEstacion(numeroMes);

        // Mostrar la estación correspondiente
        System.out.println("La estación del año para el mes " + numeroMes + " es: " + estacion);

        scanner.close();
    }

    // Método para determinar la estación del año basado en el número de mes
    public static String determinarEstacion(int numeroMes) {
        String estacion = "";
        switch (numeroMes) {
            case 1:
            case 2:
            case 12:
                estacion = "Invierno";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Otoño";
                break;
            default:
                estacion = "Mes inválido"; // En caso de un número de mes fuera del rango 1-12
                break;
        }
        return estacion;
    }
}