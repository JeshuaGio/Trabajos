import java.util.Scanner;

public class Secuenciacuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        // Solicitar al usuario un número entero positivo
        do {
            System.out.print("Ingrese un número entero positivo: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Entrada no válida. Por favor, ingrese un número entero positivo: ");
                scanner.next();
            }
            num = scanner.nextInt();
        } while (num <= 0);

        System.out.println("Los cuadrados de los números del 1 hasta " + num + " son:");

   
        int i = 1;
        do {
            System.out.println(i + "^2 = " + (i * i));
            i++;
        } while (i <= num);

        scanner.close();
    }
}
