import java.util.Scanner;

public class conteodenumeros {
     public static void main(String[] args) {
        int mayorquecero = 0,menorquecero = 0,igualacero = 0;
        Scanner a = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de numeros que deseas ingresar: ");
        int cantidad = a.nextInt();
        

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el numero: " + (i + 1) + ": ");
            int numero = a.nextInt();

            if (numero > 0) {
                mayorquecero++;
            } else if (numero < 0) {
                menorquecero++;
            } else {
                igualacero++;
            }
        }

        System.out.println("Cantidad de numeros mayores que 0: " + mayorquecero);
        System.out.println("Cantidad de numeros menores que 0: " + menorquecero);
        System.out.println("Cantidad de numeros iguales a 0: " + igualacero);
        
        a.close();
    }
}
