import java.util.Scanner;

public class PrecioFinal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el precio original del producto
        System.out.print("Ingresa el precio original del producto: ");
        double precioOriginal = scanner.nextDouble();

        // Calcular el precio final después de aplicar el descuento
        double precioFinal = calcularPrecioFinal(precioOriginal);

        // Mostrar el precio final después del descuento
        System.out.println("El precio final después del descuento es: $" + precioFinal);

        scanner.close();
    }

    // Método para calcular el precio final después de aplicar el descuento
    public static double calcularPrecioFinal(double precioOriginal) {
        double precioFinal = 0.0;

        if (precioOriginal <= 100) {
            // Sin descuento
            precioFinal = precioOriginal;
        } else if (precioOriginal > 100 && precioOriginal <= 200) {
            // 10% de descuento
            precioFinal = precioOriginal * 0.9;
        } else if (precioOriginal > 200 && precioOriginal <= 500) {
            // 20% de descuento
            precioFinal = precioOriginal * 0.8;
        } else if (precioOriginal > 500) {
            // 25% de descuento
            precioFinal = precioOriginal * 0.75;
        }

        return precioFinal;
    }
}