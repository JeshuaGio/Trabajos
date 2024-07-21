import java.util.Scanner;

public class factorialdeunnumero {

    public static void main(String[] args) {
       
        int i, f = 1;
        Scanner a = new Scanner(System.in);
        try {
            System.out.println("Ingresa un numero: ");
            int n = a.nextInt();

            for (i = 1; i <= n; i++) {
                f = f * i;
            }
            System.out.println("El factorial de " + n + " es: " + f);
        } finally {
            a.close();
        }
    }
}
