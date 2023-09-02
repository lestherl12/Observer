import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EditorNoticias editor = new EditorNoticias();
        Scanner scanner = new Scanner(System.in);

        Suscriptor suscriptor1 = new Suscriptor("Suscriptor 1");
        Suscriptor suscriptor2 = new Suscriptor("Suscriptor 2");

        editor.registrarSuscriptor(suscriptor1);
        editor.registrarSuscriptor(suscriptor2);

        while (true) {
            System.out.println("Ingrese el título de la noticia (o 'salir' para terminar): ");
            String titulo = scanner.nextLine();

            if (titulo.equalsIgnoreCase("salir")) {
                break;
            }

            System.out.println("Ingrese el contenido de la noticia: ");
            String contenido = scanner.nextLine();

            Noticia nuevaNoticia = new Noticia(titulo, contenido);
            editor.publicarNoticia(nuevaNoticia);
        }

        scanner.close();
    }
}