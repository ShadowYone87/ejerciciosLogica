import java.util.Scanner;

public class NotasNumericas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Introduce una nota numérica entre 0 y 10 (0 para salir): ");
            nota = scanner.nextInt();

            switch (nota) {
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                case 1:
                    System.out.println("Uno");
                    break;
                case 2:
                    System.out.println("Dos");
                    break;
                case 3:
                    System.out.println("Tres");
                    break;
                case 4:
                    System.out.println("Cuatro");
                    break;
                case 5:
                    System.out.println("Cinco");
                    break;
                case 6:
                    System.out.println("Seis");
                    break;
                case 7:
                    System.out.println("Siete");
                    break;
                case 8:
                    System.out.println("Ocho");
                    break;
                case 9:
                    System.out.println("Nueve");
                    break;
                case 10:
                    System.out.println("Diez");
                    break;
                default:
                    System.out.println("Nota no válida. Inténtalo de nuevo.");
            }
        } while (nota != 0);

        scanner.close();
    }
}