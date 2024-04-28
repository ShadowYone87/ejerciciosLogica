import java.util.Scanner;

public class NumerosCuadrados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        do {
            System.out.print("Introduce un número (introduce un número negativo para salir): ");
            numero = scanner.nextInt();
            
            if (numero > 0) {
                int cuadrado = numero * numero;
                System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
            } else if (numero < 0) {
                System.out.println("Número negativo ingresado. Saliendo del programa.");
            } else {
                System.out.println("Has introducido 0. Saliendo del programa.");
            }
        } while (numero >= 0);

        scanner.close();
    }
}