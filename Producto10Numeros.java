import java.util.Scanner;

public class Producto10Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 1;
        long producto = 1;

        System.out.println("Este programa calculará el producto de los 10 primeros números impares.");

        do {
            System.out.println("El número actual es: " + numero);
            producto *= numero;
            numero += 2;
        } while (numero <= 19); // El ciclo se ejecutará para los 10 primeros números impares

        System.out.println("El producto de los 10 primeros números impares es: " + producto);
    }
}