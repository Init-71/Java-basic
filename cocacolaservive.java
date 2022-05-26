import java.util.Scanner;

public class cocacolaservive {
    public static void main(String[] args) {

        //Definimos nuestro objeto que recoge caracteres del teclado
        Scanner entrada = new Scanner(System.in);
        //Definimos las variables
        String nombre = "";
        int clave = 0;
        int antiguedad = 0;

        //Damos la bienvenida
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Bienvenido al sistema vacacional de COCA COLA");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("");
        System.out.println("");

        //Preguntamos el nombre del trabajador
        System.out.print("¿Cual es el nombre del trabajador?: ");
        //Guardamos el nombre del usuario en la variable nombre
        nombre = entrada.nextLine();
        System.out.println("");

        //Preguntamos cual es el tiempo de servicio que lleva el trabajador
        System.out.print("¿Cuantos años de servicio tiene el trabajador: ");
        antiguedad = entrada.nextInt();
        System.out.println("");

        //Preguntamos la clave del trabajador
        System.out.print("¿Cual es la clave del trabajador: ");
        clave = entrada.nextInt();
        System.out.println("");

        //Preguntamos que numero de clave tiene, con un sistema de condiciones anidadas
        if(clave == 1){

            if(antiguedad == 1){
                System.out.println("El trabajador: " + nombre + " tiene derecho a 6 días de vacaciones");
            }else if(antiguedad >= 2 && antiguedad <= 6){
                System.out.println("El trabajador: " + nombre + " tiene derecho a 14 días de vacaciones");
            } else if(antiguedad >=7){
                System.out.println("El trabajador: " + nombre + " tiene derecho a 20 días de vacaciones");
            }

        }else if(clave==2){

            if(antiguedad == 1){
                System.out.println("El trabajador: " + nombre + " tiene derecho a 7 días de vacaciones");
            }else if(antiguedad >= 2 && antiguedad <= 6){
                System.out.println("El trabajador: " + nombre + " tiene derecho a 15 días de vacaciones");
            } else if(antiguedad >=7){
                System.out.println("El trabajador: " + nombre + " tiene derecho a 22 días de vacaciones");
            }

        }else if(clave==3){

            if(antiguedad == 1){
                System.out.println("El trabajador: " + nombre + " tiene derecho a 10 días de vacaciones");
            }else if(antiguedad >= 2 && antiguedad <= 6){
                System.out.println("El trabajador: " + nombre + " tiene derecho a 20 días de vacaciones");
            } else if(antiguedad >=7){
                System.out.println("El trabajador: " + nombre + " tiene derecho a 30 días de vacaciones");
            }

        }else{
            System.out.println("La clave de departamento es incorrecta");
        }
    }
}
