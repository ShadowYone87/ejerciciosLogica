import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcion;
        
        do {
            System.out.println("Ingrese el primer número:");
            double num1 = scanner.nextDouble();
            System.out.println("Ingrese el segundo número:");
            double num2 = scanner.nextDouble();
            
            System.out.println("Seleccione la operación a realizar:");
            System.out.println("a) Suma");
            System.out.println("b) Resta");
            System.out.println("c) Multiplicación");
            System.out.println("d) División");
            opcion = scanner.next().charAt(0);
            
            switch (opcion) {
                case 'a':
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                case 'b':
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                case 'c':
                    System.out.println("La multiplicación es: " + (num1 * num2));
                    break;
                case 'd':
                    if (num2 != 0) {
                        System.out.println("La división es: " + (num1 / num2));
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
            
            System.out.println("¿Desea realizar otra operación? (s/n)");
            opcion = scanner.next().charAt(0);
        } while (opcion == 's' || opcion == 'S');
        
        System.out.println("¡Gracias por usar la calculadora!");
        scanner.close();
    }
}