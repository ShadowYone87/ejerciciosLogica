import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa el primer numero:");
        double a = scanner.nextDouble();
        
        System.out.println("Ingresa el segundo numero:");
        double b = scanner.nextDouble();
        
        if (b != 0) {
            double division = a / b;
            System.out.println("La division es: " + division);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
        
    }
}