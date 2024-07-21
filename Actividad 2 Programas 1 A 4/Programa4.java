import java.util.Scanner;

public class Programa4 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       
        double porcentaje,impuestos,deducciones,salarioneto,salariobruto; 
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese Su Salario Bruto Que Gana Al Mes: ");
        salariobruto = teclado.nextDouble();
        
        System.out.println("Ingrese El Porcentaje De Deducciones De Impuestos: ");
        porcentaje = teclado.nextDouble();
        
        System.out.println("Ingrese Las Deducciones Adicionales: ");
        deducciones = teclado.nextDouble();
        
        impuestos = salariobruto*(porcentaje/100);
        salarioneto = salariobruto-impuestos-deducciones;
        
        System.out.println("Su Indice De Masa Corporal Es De: " + salarioneto);
    }
    
}