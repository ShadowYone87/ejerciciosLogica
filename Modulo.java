import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número:");
        double a = scanner.nextDouble();
        
        System.out.println("Ingrese el segundo número:");
        double b = scanner.nextDouble();
        
        if (b != 0) {
            double modulo = a % b;
            System.out.println("El módulo es: " + modulo);
        } else {
            System.out.println("No se puede calcular el módulo por cero.");
        }
        
    }
}