import java.util.Scanner;

public class Practicanueva {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Enciende el velador? (true o false)");
        boolean encendido = sc.nextBoolean();

        if (encendido) {
            System.out.println("No hay que realizar nada más");
        } else {
            System.out.println("¿Está enchufado el velador? (true o false)");
            boolean enchufado = sc.nextBoolean();

            if (enchufado) {
                System.out.println("¿Está quemado el foco? (true o false)");
                boolean focoQuemado = sc.nextBoolean();

                if (focoQuemado) {
                    System.out.println("Cambiar el foco");
                } else {
                    System.out.println("Llevar a reparar");
                }
            } else {
                System.out.println("Enchufar el velador");
            }
        }

        sc.close();
    }
}