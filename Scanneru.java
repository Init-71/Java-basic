import java.util.Scanner;

public class Scanneru {
    public static void main(String args[]){
        //Nuevo objeto que recoge caracter del teclado
        //Llamamos a Scanner le damos nombre {teclado} creamos nuevo objeto
        Scanner teclado = new Scanner(System.in);
        String nombre = "";
        //inicializar varias variables
        int numUno =0, numDos =0, resultado =0;

        System.out.println("Cual es tu nombre?");
        //Guardamos texto con .nextLine()
        nombre = teclado.nextLine();

        System.out.println("Dime un numero para sumarlo");
        //Guardamos numeros enteros con .nextInt()
        numUno = teclado.nextInt();

        System.out.println("Dime el segundo numero de la suma");
        //Guardamos numeros enteros con .nextInt()
        numDos = teclado.nextInt();

        //Realizamos la suma 
        resultado = numUno + numDos;

        //Concatenamos los resultados
        System.out.println("Tu nombre es: " + nombre + " y el resultado de la suma es: " + resultado);
    }
}
