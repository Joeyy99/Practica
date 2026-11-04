
import java.util.Scanner;


public class Practica {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nombre, apellido, direccion, telefono, cedula;
        int edad;
        double salario;
        boolean estaSoltero;

        System.out.println("SISTEMA DE GESTION DE DATOS");
        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = sc.nextLine();    
        System.out.println("Ingrese su direccion");
        direccion = sc.nextLine();
        System.out.println("Ingrese su telefono");
        telefono = sc.nextLine();
        System.out.println("Ingrese su cedula");
        cedula = sc.nextLine();
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        System.out.println("Ingrese su salario");
        salario = sc.nextDouble();
        System.out.println("Esta soltero True/False");
        estaSoltero = sc.nextBoolean();
    
        

        System.out.println();
        System.out.println("Su nombre es: "+ nombre);
        System.out.println("Su apellido es: "+ apellido);
        System.out.println("Su direccion es: "+ direccion);
        System.out.println("Su telefono es: "+ telefono);
        System.out.println("Su cedula es: "+ cedula);
        System.out.println("Su edad es: "+ edad);
        System.out.println("Su salario es: "+ salario);
        System.out.println("Esta soltero: "+ estaSoltero);
    
    
    }
}
