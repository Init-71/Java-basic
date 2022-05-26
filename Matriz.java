public class Matriz {
    public static void main(String[] args) {
        /*Realizar una matriz 2x2 */
        //Matriz arreglo bimensional

        //Tipo de dato / nombre / doble corchete / new / tipo de dato / numero de filas / numero de columnas
        int matriz [][] = new int [2][2];

        //Ingresar datos al arreglo
        matriz [0][0] = 5;
        matriz [0][1] = 2;
        matriz [1][0] = 2;
        matriz [1][1] = 5;

        //Imprimir datos de la matriz
        System.out.print("[" + matriz[0][0] + "]");
        System.out.println("[" + matriz[0][1] + "]");
        System.out.print("[" + matriz[1][0] + "]");
        System.out.print("[" + matriz[1][1] + "]");

        System.out.println("");
        System.out.println("");

        /*EJERCICIO MATRIZ DINAMICA*/
        int filas = 3;
        int columnas = 3;
        int contador =1;
        int numeros [][] = new int [filas][columnas];
        for(int j = 0; j<filas; j++){
            for(int i =0; i<columnas; i++){
                numeros[j][i] = contador;
                contador++;
                System.out.print("[" + numeros[j][i] + ']');
            }
            System.out.println("");
        }
    }
}
