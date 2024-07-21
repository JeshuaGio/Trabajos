import java.util.Scanner;

public class NombreArtista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de un artista, película, serie, etc.:");
        String opcion = scanner.nextLine();

        switch (opcion.toLowerCase()) {
            case "artista":
                System.out.println("Información sobre el artista:");
                System.out.println("- Datos biográficos.");
                System.out.println("- Discografía.");
                break;
            case "película":
                System.out.println("Información sobre la película:");
                System.out.println("- Director.");
                System.out.println("- Reparto principal.");
                System.out.println("- Resumen de la trama.");
                break;
            case "serie":
                System.out.println("Información sobre la serie:");
                System.out.println("- Creador.");
                System.out.println("- Elenco principal.");
                System.out.println("- Número de temporadas.");
                break;
            case "libro":
                System.out.println("Información sobre el libro:");
                System.out.println("- Autor.");
                System.out.println("- Género literario.");
                System.out.println("- Sinopsis.");
                break;
            case "videojuego":
                System.out.println("Información sobre el videojuego:");
                System.out.println("- Desarrollador.");
                System.out.println("- Plataformas disponibles.");
                System.out.println("- Género del juego.");
                break;
            default:
                System.out.println("No se encontró información para '" + opcion + "'.");
                break;
        }

        scanner.close();
    }
}