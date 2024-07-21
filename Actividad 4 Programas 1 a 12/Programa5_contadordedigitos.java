import java.util.Scanner;

public class contadordedigitos {
     public static void main(String[] args) {
        int digitos = 0;
        Scanner a = new Scanner(System.in);
        System.out.println("ingresa el numero");
        int numero = a.nextInt();
        
       int numerobien = Math.abs(numero);
    
       while (numerobien > 0) {
        numerobien /= 10;
        digitos++;
       }
       
       if (numero == 0) {
        numerobien = 1;
       }
       System.out.println("El numero " + numero + " tiene " + digitos + " digitos.");        

    
        a.close();
    }
}
