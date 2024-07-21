import java.util.Scanner;

public class Programa5 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       
        int parcial,proyecto,examenfinal,promedio;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresa La Calificacion De Su Examen Final De 0 A 100: ");
        examenfinal = (int) teclado.nextDouble();
        
        if(examenfinal>=100){
            System.out.println("Solo Se admite Calificaciones Menores A 100");
            return;
        }
        
        System.out.println("Ingrese La Calificacion De Su Proyecto De 0 A 100: ");
        proyecto = (int) teclado.nextDouble();
        
        if(proyecto>=100){
            System.out.println("Solo Se admite Calificaciones Menores A 100");
            return;
        }
        
        System.out.println("Ingrese La Calificacion De Su Parcial De 0 A 100: ");
        parcial = (int) teclado.nextDouble();
      
        if(parcial>=100){
            System.out.println("Solo Se admite Calificaciones Menores A 100");
            return;
        }
       
        promedio= (int) (examenfinal * 0.3 + proyecto * 0.3 + parcial*0.4);
        
        System.out.println("El Promedio Final Es De: " + promedio);
                
    }
    }