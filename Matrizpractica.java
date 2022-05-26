import java.util.Scanner;
public class Matrizpractica {
    public static void main(String[] args) {
        
        //Variables
        Scanner teclado = new Scanner(System.in);
        int filas = 0;
        int columnas = 0;
        int contador = 0;
        
        //Filas
        System.out.println("Cuantas filas desea? ");
        filas = teclado.nextInt();

        //Columnas
        System.out.println("Cuantas columnas desea? ");
        filas = teclado.nextInt();

        //Matriz
        int numeros [][] = new int [filas][columnas];

        //Ciclo de llenado 
        for(int j = 0; j<filas; j++){
            for(int i = 0; i<columnas; i++){
                numeros[j][i] = contador;
                contador++;
                System.out.print("[" + numeros[j][i] + "]");
            }
            System.out.println("");
        }
    }
}