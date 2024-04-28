import java.util.Scanner;

public class MultiplicacionRecursiva {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los dos números a multiplicar:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        int resultado = multiplicacionRecursiva(num1, num2);
        
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
    
    public static int multiplicacionRecursiva(int a, int b) {
        int resultado = 0;
        int contador = 0;
        boolean esPositivo = true;
        
        if (a < 0 && b < 0) {
            a = -a;
            b = -b;
        } else if (a < 0 || b < 0) {
            esPositivo = false;
            if (a < 0) a = -a;
            else b = -b;
        }
        
        do {
            resultado += b;
            contador++;
        } while (contador < a);
        
        return esPositivo ? resultado : -resultado;
    }
}