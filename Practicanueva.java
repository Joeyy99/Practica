import java.util.Scanner;

public class Practicanueva {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        //PRUEBA DE UN IF 
        boolean esVelador;
        System.out.println("Enciende el velador, escribir true o false");
        esVelador = sc.nextBoolean();

        if (esVelador) {
            System.out.println("No hay que realizar nada mas ");
        }else if (esVelador){
            System.out.println("Esta enchufado el velador?");
            esVelador = sc.nextBoolean();
            if (esVelador) {
            System.out.println("Esta quemado el foco");  
            esVelador = sc.nextBoolean();  
            System.out.println("Cambiar el foco");
            System.out.println("No hay que realizar nada mas ");
            }else{
                System.out.println("Llevar a reparar");
                System.out.println("No hay que realizar nada mas ");
            }
        }else {
            System.out.println("Eschufar el velador");
        }
        
        
    }
}
