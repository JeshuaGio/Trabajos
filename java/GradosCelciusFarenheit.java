import java.util.Scanner;

public class GradosCelciusFarenheit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la temperatura en grados Celsius
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        // Mostrar menú de opciones
        System.out.println("Elige una opción para convertir la temperatura:");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Celsius a Kelvin");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        // Realizar la conversión según la opción seleccionada
        switch (opcion) {
            case 1:
                double temperaturaFahrenheit = celsiusAFahrenheit(temperaturaCelsius);
                System.out.println(temperaturaCelsius + " grados Celsius equivalen a " + temperaturaFahrenheit + " grados Fahrenheit.");
                break;
            case 2:
                double temperaturaKelvin = celsiusAKelvin(temperaturaCelsius);
                System.out.println(temperaturaCelsius + " grados Celsius equivalen a " + temperaturaKelvin + " Kelvin.");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        scanner.close();
    }

    // Método para convertir Celsius a Fahrenheit
    public static double celsiusAFahrenheit(double temperaturaCelsius) {
        return (temperaturaCelsius * 9/5) + 32;
    }

    // Método para convertir Celsius a Kelvin
    public static double celsiusAKelvin(double temperaturaCelsius) {
        return temperaturaCelsius + 273.15;
    }
}