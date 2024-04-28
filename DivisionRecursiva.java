import java.util.Scanner;

public class DivisionRecursiva {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        int dividendo = scanner.nextInt();
        System.out.print("Ingrese el divisor: ");
        int divisor = scanner.nextInt();
        
        int resultado = divisionRecursiva(dividendo, divisor);
        System.out.println("El resultado de la división es: " + resultado);
        
        scanner.close();
    }
    
    public static int divisionRecursiva(int dividendo, int divisor) {
        if (dividendo < divisor) {
            return 0;
        }
        
        int cociente = 0;
        do {
            dividendo -= divisor;
            cociente++;
        } while (dividendo >= divisor);
        
        return cociente;
    }
}