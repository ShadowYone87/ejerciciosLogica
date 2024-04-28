import java.util.Scanner;

public class DetectorDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Introduce la nota (0 para salir): ");
            nota = scanner.nextInt();

            switch (nota) {
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                case 1:
                case 2:
                case 3:
                    System.out.println("Insuficiente");
                    break;
                case 4:
                case 5:
                    System.out.println("Suficiente");
                    break;
                case 6:
                case 7:
                    System.out.println("Bien");
                    break;
                case 8:
                case 9:
                case 10:
                    System.out.println("Excelente");
                    break;
                default:
                    System.out.println("Nota inválida. Inténtalo de nuevo.");
                    break;
            }
        } while (nota != 0);

        scanner.close();
    }
}