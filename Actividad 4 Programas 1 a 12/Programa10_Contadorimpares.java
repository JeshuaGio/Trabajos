import java.util.Scanner;

public class Contadorimpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;


        do {
            System.out.print("Ingrese un número entero positivo: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Entrada no válida. Por favor, ingrese un número entero positivo: ");
                scanner.next();
            }
            num = scanner.nextInt();
        } while (num <= 0);

        System.out.println("Los números impares del 1 hasta " + num + " son:");


        int i = 1;
        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= num);

        scanner.close();
    }
 }