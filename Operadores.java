import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        /*
        hacer una operacion donde ingrese por teclado los numeros
        1. Pedir los numeros a y b
        2. hacer la operacion de suma a esos numeros
        3. imprimir a consola
        */
        Scanner sc = new Scanner(System.in);
        int a,b,suma;
        System.out.println("Ingrese el valor de a");
        a=sc.nextInt();
        System.out.println("Ingrese el valor de b");
        b =sc.nextInt();

        suma=a+b;

        System.out.println("La suma es: "+suma);
    }
}
