import java.util.Scanner;

public class VocalOConsonante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Dame una letra. Ingrese un espacio entre palabras para terminar.");

        while (true) {
            System.out.print("Ingresa una letra: ");
            input = scanner.nextLine();

            if (input.contains(" ")) {
                break;
            }

            if (input.length() != 1) {
                System.out.println("Por favor, ingrese solo una letra.");
                continue;
            }

            char letra = input.charAt(0);

            if (esVocal(letra)) {
                System.out.println(letra + " es una vocal.");
            } else if (Character.isLetter(letra)) {
                System.out.println(letra + " es una consonante.");
            } else {
                System.out.println("Letra no valida. Por favor, ingrese una letra.");
            }
        }

        scanner.close();
        System.out.println("Programa terminado.");
    }

    public static boolean esVocal(char letra) {
        letra = Character.toLowerCase(letra);
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }
}
