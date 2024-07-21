import java.util.Scanner;

public class contarletras_a {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int conta = 0;

        System.out.print("Ingresa una palabra: ");
        String palabra = a.nextLine();

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'A' || palabra.charAt(i) == 'a') {
                conta++;
            }
        }
        
        // Mostrar el resultado
        System.out.println("La letra (a) aparece : " + conta + " veces en la palabra " + palabra);
        
        // Cerrar el Scanner
        a.close();
    }
}
