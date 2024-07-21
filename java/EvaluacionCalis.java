import java.util.Scanner;

public class EvaluacionCalis {

    public static void main(String[] args) {
        
System.out.println("evaluacioncalis");

Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la calificación
        System.out.print("Ingresa la calificación numérica: ");
        int calificacion = scanner.nextInt();

        // Evaluar la calificación e imprimir la letra correspondiente
        char letra = obtenerLetra(calificacion);
        System.out.println("La letra asignada es: " + letra);

        scanner.close();
    }

    // Método para obtener la letra correspondiente a la calificación
    public static char obtenerLetra(int calificacion) {
        if (calificacion >= 90 && calificacion <= 100) {
            return 'A';
        } else if (calificacion >= 80 && calificacion <= 89) {
            return 'B';
        } else if (calificacion >= 70 && calificacion <= 79) {
            return 'C';
        } else if (calificacion >= 60 && calificacion <= 69) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
