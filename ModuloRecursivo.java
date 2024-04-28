import java.util.Scanner;

public class ModuloRecursivo {
    
    public static int modulo(int dividendo, int divisor) {
        // Caso base: cuando el dividendo es menor que el divisor, el módulo es el dividendo
        if (dividendo < divisor) {
            return dividendo;
        }
        // Caso recursivo: restar el divisor del dividendo hasta que sea menor que el divisor
        return modulo(dividendo - divisor, divisor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el dividendo: ");
        int dividendo = scanner.nextInt();
        
        System.out.print("Ingrese el divisor: ");
        int divisor = scanner.nextInt();
        
        // Validar que el divisor no sea cero
        if (divisor == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return;
        }
        
        // Calcular el módulo utilizando el método recursivo
        int resultado = modulo(dividendo, divisor);
        
        System.out.println("El módulo es: " + resultado);
        
        scanner.close();
    }
}