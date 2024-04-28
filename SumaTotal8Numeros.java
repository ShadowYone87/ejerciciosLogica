import java.util.Scanner;

public class SumaTotal8Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;

        System.out.println("Ingrese 8 números. Ingrese 0 para finalizar.");

        int contador = 0;
        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();
            suma += numero;
            contador++;
        } while (contador < 8 && numero != 0);

        System.out.println("La suma total es: " + suma);

        scanner.close();
    }
}