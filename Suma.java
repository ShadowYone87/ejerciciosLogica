import java.util.Scanner;
class Suma{
    public static void main(String[]args){
        Scanner num = new Scanner(System.in);
        int a,b,c;
        System.out.println("Ingrese el primer numero");
        a=num.nextInt();
        System.out.println("Ingrese el segundo numero");
        b=num.nextInt();
        c=a+b;
        System.out.println("El resultado es:"+c);
    }
}