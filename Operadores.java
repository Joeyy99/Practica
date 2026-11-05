import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        /*
        TABLA DE MULTIPLICAR
        1. Pedir el numero al usuario de la tabla que desea saber la tabla demultiplicar ejm: 5
        2. Verificar que el numero sea mayor a 0, si pone 0 decir que no todo numero multiplicado por 0 es 0
        3. Hacer la operacion de la multiplicacion , numero ingresado (siempre es fijo) * i (incrementa) esto 
        guardo en un resultado para luego mostrar en pantalla 
        4. imprimir la tabla en orden
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de la tabla de multiplicar que desea");
        int tabla =sc.nextInt();
        if (tabla>0){
            for (int i=1;i<11;i++){
                int resultado;
                resultado = tabla * i;
                System.out.println(" " + tabla + " * " + i + " = "+ resultado);
            }
        }else if (tabla==0){
            System.out.println("Todo numero multiplicado por 0 es igual a 0");
        }else {
        System.out.println("numero invalido debe ser mayor a 0");
        }
    }
}
