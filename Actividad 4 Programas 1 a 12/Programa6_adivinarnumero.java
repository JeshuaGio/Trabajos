import java.util.Random;
import java.util.Scanner;

public class adivinarnumero {
    
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Random numeroaleatorio = new Random();
        int numero = numeroaleatorio.nextInt(100) +1;
        int intento;
        boolean adivinado = false;

        while (!adivinado) {
            System.out.println("Adivina el numero entre 1 y 100");
            intento = a.nextInt();
            if (intento < numero) {
                System.out.println("Demasiado bajo intentalo denuveo.");
            } else if (intento > numero) {
                System.out.println("Demasiado alto intentalo denuveo.");
            } else {
                System.out.println("Ingresaste el numero correcto");
                adivinado = true;
            }
        }
        a.close();
    }
}
