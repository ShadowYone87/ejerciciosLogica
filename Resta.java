import java.util.Scanner;

public class Resta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero:");
        double a = scanner.nextDouble();
        
        System.out.println("Ingrese el segundo numero:");
        double b = scanner.nextDouble();
        
        double resta = a - b;
        System.out.println("La resta es: " + resta);
        
    }
}