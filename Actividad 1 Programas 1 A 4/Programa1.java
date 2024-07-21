import java.util.Scanner;

public class Programa1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int base=0 ,altura=0, resultado;  
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresa La Medida De La Base Del Rectangulo: ");
        base = (int) teclado.nextDouble();
        
        System.out.println("Ingresa La Medida De La Altura Del Rectangulo: ");
        altura = (int) teclado.nextDouble();
        
        resultado= base*altura;
        
        System.out.println("El Area Del Rectangulo Es: "+ resultado);
        
    }
    
}