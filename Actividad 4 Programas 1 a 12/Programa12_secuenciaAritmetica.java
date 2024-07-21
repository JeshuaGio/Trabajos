import java.util.Scanner;

public class SecuenciaAritmetica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingresa el primer número de la secuencia: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa la diferencia entre los números: ");
        int diferencia = scanner.nextInt();

        System.out.print("Ingresa el número máximo hasta el cual la secuencia debe continuar: ");
        int numMaximo = scanner.nextInt();

        int numActual = num1;

        System.out.println("Secuencia Aritmética:");
        do {
            System.out.print(numActual + " ");
            numActual += diferencia;
        } while (numActual <= numMaximo);

        scanner.close();
    }
}
