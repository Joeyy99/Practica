public class Practicanueva {
    public static void main(String[] args) {
        String [] nombres = {"Joel", "Matias"};
        nombres [0] = "Angelica";


        System.out.println(nombres [0]); 


        String prueba = "Hola mundo      ";
        System.out.println("El texto " + prueba + " tiene " + prueba.length());
        System.out.println("El texto en minusculas es  " + prueba.toLowerCase());
        System.out.println("El texto en mayuscula es  " + prueba.toUpperCase());

        if (prueba.length() > 15) {
            System.out.println("Hola nina bonita");
        }else{
            System.out.println("olaaaa");
        }

        
    }
}
