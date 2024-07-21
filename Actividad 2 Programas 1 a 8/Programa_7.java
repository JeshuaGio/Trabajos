import java.util.Scanner;

public class PesosMexas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la cantidad en pesos mexicanos
        System.out.print("Ingresa la cantidad en pesos mexicanos: ");
        double cantidadMXN = scanner.nextDouble();

        // Mostrar menú de opciones para las monedas a convertir
        System.out.println("Elige una moneda a la cual convertir:");
        System.out.println("1. Dólar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Bath (THB)");
        System.out.println("4. Yen (JPY)");
        System.out.println("5. Won (KRW)");
        System.out.println("6. Dólar Australiano (AUD)");
        System.out.println("7. Sol (PEN)");
        System.out.println("8. Dólar Canadiense (CAD)");
        System.out.println("9. Bolívar (VES)");
        System.out.println("10. Peso Argentino (ARS)");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        // Realizar la conversión según la opción seleccionada
        switch (opcion) {
            case 1:
                convertirAMoneda(cantidadMXN, "Dólar", 20.23);
                break;
            case 2:
                convertirAMoneda(cantidadMXN, "Euro", 22.38);
                break;
            case 3:
                convertirAMoneda(cantidadMXN, "Bath", 0.63);
                break;
            case 4:
                convertirAMoneda(cantidadMXN, "Yen", 0.18);
                break;
            case 5:
                convertirAMoneda(cantidadMXN, "Won", 0.016);
                break;
            case 6:
                convertirAMoneda(cantidadMXN, "Dólar Australiano", 14.72);
                break;
            case 7:
                convertirAMoneda(cantidadMXN, "Sol", 4.85);
                break;
            case 8:
                convertirAMoneda(cantidadMXN, "Dólar Canadiense", 16.14);
                break;
            case 9:
                convertirAMoneda(cantidadMXN, "Bolívar", 0.0022);
                break;
            case 10:
                convertirAMoneda(cantidadMXN, "Peso Argentino", 0.20);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        scanner.close();
    }

    // Método para realizar la conversión de pesos mexicanos a la moneda seleccionada
    public static void convertirAMoneda(double cantidadMXN, String nombreMoneda, double tipoCambio) {
        double cantidadConvertida = cantidadMXN / tipoCambio;
        System.out.printf("%.2f pesos mexicanos equivalen a %.2f %s.\n", cantidadMXN, cantidadConvertida, nombreMoneda);
    }
}