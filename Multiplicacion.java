import java.util.Scanner;

public class Multiplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa primer numero:");
        double a = scanner.nextDouble();
        
        System.out.println("Ingresa el segundo numero:");
        double b = scanner.nextDouble();
        
        double multiplicacion = a * b;
        System.out.println("La multiplicacion es: " + multiplicacion);
        
    }
}