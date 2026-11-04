import java.util.Scanner;

/**
Escriba un programa que solicite la nota de un estudiante, que debe estar entre 0 y 20. 
Si la nota es 14 o más, el programa debe indicar que el estudiante aprobó; si es menor, 
que reprobó. Si la nota ingresada está fuera del rango permitido, debe mostrar un mensaje de error.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nota");
        double nota = sc.nextDouble();
        System.out.println();
        while (nota < 0 || nota > 20) {
            System.out.println("Nota invalida");
            System.out.println("Ingrese una nota valida");
            nota =sc.nextDouble();
            if (nota >= 0 && nota <= 20) {
            System.out.println("Nota valida");
        }
        }
            if (nota>=14) {
                System.out.println("APROBO");
            }else{
                System.out.println("REPROBO");
            }
        }
    }

