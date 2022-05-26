import java.util.Scanner;
public class Strings1 {
    public static void main(String args[]) {
        
        //Definimos las variables que vamos a utilizar
        String nombreUno = "", nombreDos = "";

        //Definimos nuestro objeto de recogida de datos de teclado
        Scanner entrada = new Scanner(System.in);

        //Ingresamos el primer nombre y lo almacenamos en la variable NombreUno
        System.out.println("Ingrese el primer nombre: ");
        nombreUno = entrada.nextLine();

        //Ingresamos el primer nombre y lo almacenamos en la variable NombreUno
        System.out.println("Ingrese el segundo nombre: ");
        nombreDos = entrada.nextLine();
        
        //Compara los nombres e ignora la manera de escribirlos *(Mayusculas de minusculas)* Utilizando el metodo Equals
        if(nombreUno.equalsIgnoreCase(nombreDos)){
            System.out.println("Los nombres son iguales");
        }else{
            System.out.println("Los nombres no son iguales");
        }
    }
}