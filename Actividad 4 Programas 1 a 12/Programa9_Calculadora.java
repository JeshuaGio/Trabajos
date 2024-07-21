import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;

        while (true) {
            System.out.println("\n--- Calculadora Básica ---");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 5) {
                System.out.println("Saliendo del programa...");
                break;
            }

            System.out.print("Ingrese el primer número: ");
            num1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            num2 = scanner.nextDouble();

            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("El resultado de la división es: " + resultado);
                    } else {
                        System.out.println("Error: División entre cero no permitida.");
                    }
                    break;
                default:
                    System.out.println("Error. Por favor, seleccione una opción del 1 al 5.");
                    break;
            }
        }

        scanner.close();
    }
}
