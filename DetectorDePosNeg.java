import java.util.Scanner;

public class DetectorDePosNeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número (0 para salir): ");
            numero = scanner.nextInt();

            if (numero > 0) {
                System.out.println("El número es positivo.");
            } else if (numero < 0) {
                System.out.println("El número es negativo.");
            } else {
                System.out.println("Has introducido 0. Saliendo del programa...");
            }
        } while (numero != 0);

        scanner.close();
    }
}