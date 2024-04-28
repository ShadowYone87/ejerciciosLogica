import java.util.Scanner;

public class SumaRecursiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número positivo para sumar recursivamente: ");
        int numero = scanner.nextInt();
        
        if (numero < 0) {
            System.out.println("El número debe ser positivo.");
            return;
        }
        
        int resultado = sumaRecursiva(numero);
        System.out.println("La suma recursiva de los números del 1 al " + numero + " es: " + resultado);
    }
    
    public static int sumaRecursiva(int n) {
        int suma = 0;
        int contador = 1;
        
        do {
            suma += contador;
            contador++;
        } while (contador <= n);
        
        return suma;
    }
}