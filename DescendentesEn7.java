import java.util.Scanner;

public class DescendentesEn7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 100;
        int paso = 7;
        int entrada;

        do {
            System.out.println("Número actual: " + numero);
            System.out.println("Introduce 0 para salir o cualquier otro número para continuar: ");
            entrada = scanner.nextInt();

            numero -= paso;

        } while (entrada != 0 && numero >= 0);

        System.out.println("Programa finalizado.");
    }
}