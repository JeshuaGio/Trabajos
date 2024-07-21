import java.util.Scanner;

public class Programa3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double peso,altura,resultado;
        
       Scanner teclado = new Scanner(System.in);
       
        System.out.println("Ingrese Su Peso En Kilogramos: ");
        peso = teclado.nextDouble();
        
        System.out.println("Ingrese Su Altura En Metros: ");
        altura = teclado.nextDouble();
        
        resultado= peso/(altura*altura);
        
        System.out.println("Su Indice De Masa Corporal Es De: " + resultado);
      
    }
    
}