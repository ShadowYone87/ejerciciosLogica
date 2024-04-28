import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer número:");
        int numero1 = scanner.nextInt();

        System.out.println("Ingresa el segundo número:");
        int numero2 = scanner.nextInt();

        if (numero1 < numero2) {
            System.out.println(numero1 + " es menor que " + numero2);
        } else if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);
        } else {
            System.out.println(numero1 + " es igual a " + numero2);
        }
    }
}