import java.util.Scanner;

public class Medianumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador=0;
        double suma=0;
        double num;

        System.out.println("Dame numeros positivos.");
        while (true) {
            System.out.println("Ingresa un numero");
            num= scanner.nextDouble(); 
            if (num<0) {
                break;
            }
            suma+=num;
            contador++;

            
        }
        if (contador>0) {
            double media = suma / contador;
            System.out.println("La media de la suma de los numeros es" + " " + media);
            
        }else{
            System.out.println("No son positivos");
        }
        scanner.close();

     

 }
 }