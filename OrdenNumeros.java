import java.util.Scanner;
import java.util.Arrays;

public class OrdenNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[3];
        
        do {
            System.out.println("Introduce un número (0 para salir): ");
            numeros[0] = scanner.nextInt();
            if(numeros[0] == 0)
                break;
            
            System.out.println("Introduce otro número: ");
            numeros[1] = scanner.nextInt();
            if(numeros[1] == 0)
                break;
            
            System.out.println("Introduce otro número: ");
            numeros[2] = scanner.nextInt();
            if(numeros[2] == 0)
                break;
            
            Arrays.sort(numeros);
            
            System.out.println("Los números ordenados son: ");
            for (int num : numeros) {
                System.out.println(num);
            }
        } while (true);
        
        System.out.println("Programa terminado.");
        scanner.close();
    }
}