import java.util.Scanner;

public class RestaRecursiva {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario los números a restar
        System.out.println("Ingrese el primer número:");
        int minuendo = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        int sustraendo = scanner.nextInt();
        
        // Realizar la resta recursiva
        int resultado = restaRecursiva(minuendo, sustraendo);
        
        // Mostrar el resultado
        System.out.println("El resultado de la resta es: " + resultado);
        
        scanner.close();
    }
    
    // Método para realizar la resta recursiva
    public static int restaRecursiva(int minuendo, int sustraendo) {
        int resultado = minuendo;
        
        // Bucle do-while para restar el sustraendo del minuendo
        do {
            resultado -= sustraendo;
        } while (resultado >= sustraendo);
        
        return resultado;
    }
}