import java.util.Scanner;

public class Programa2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        int numero1 ,numero2, numero3,suma,promedio;  
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresa EL Primer Nuemro: ");
        numero1 = (int) teclado.nextDouble();
        
        System.out.println("Ingresa El Segundo Numero: ");
        numero2 = (int) teclado.nextDouble();
        
        System.out.println("Ingresa El Tercer Numero: ");
        numero3 = (int) teclado.nextDouble();
        
       suma=numero1+numero2+numero3;
       promedio=suma/3;
       
       System.out.println("El Promedio De Los 3 Numeros Es: "+ promedio);
        
    }
    
}