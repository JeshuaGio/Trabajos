import java.util.Scanner;
public class Programa6 {

    /**
     * @param args the command line arguments
     */
    
  
    public static void main(String[] args) {
       
        int edad=0;
        Scanner T =new Scanner(System.in);
        
        System.out.println("Ingresa tu edad");
        edad= T.nextInt();
        
        if (edad >=0 && edad<=17){
            System.out.println("No Tienes La Edad Suficiente Para Votar");
        }
        else{
            System.out.println("Puedes Votar Adelante");
        }
    }
    
}