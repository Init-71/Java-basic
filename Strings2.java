import java.util.Scanner;

public class Strings2 {
    public static void main(String[] args) {
        
        //Definimos obejto de recogida de teclado
        Scanner teclado = new Scanner(System.in);

        //Definimos variables
        String primerdaCadena = "";
        //Definimos variables para usar el metodo Substring
        int desde = 0, hasta = 0;

        //Preguntamos cual es su nombre para contar el numero de caracteres con el metodo leght y mostrarlo en pantalla
        System.out.println("Cual es tu nombre?!");
        primerdaCadena = teclado.nextLine();
        System.out.println("Tu nombre tiene: "+primerdaCadena.length()+" caracteres");

        //Que parte de la cadena desea utilizar
        System.out.println("Desde que punto de la cadena desea obtener la nueva cadena?");
        desde = teclado.nextInt();
        System.out.println("Hasta que punto de la cadena desea obtener la nueva cadena?");
        hasta = teclado.nextInt();
        //Utlizamos el metodo substring
        System.out.println("El resultado es> "+primerdaCadena.substring(desde, hasta));
    }
}
