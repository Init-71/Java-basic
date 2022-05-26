public class Vectores {
    public static void main(String[] args) {
        
        //Vectores, arreglos unidimensionales

    //tipo de dato ~ nombre del vector ~ new ~ tipo de dato ~ numero de posiciones
        int numeros[]= new int[5];
    //Para ingresar valores al vector
    //nombre del arreglo ~ posicion del vector ~ elemento a guardar
        numeros[2] = 3;
    //Impresion de datos de vectores
        System.out.println(numeros[2]);

        /* EJERCICIO */
        String names[] = new String[5];
        //Guardar un dato en cada posicion
        names[0] = "Pedro";
        names[1] = "Santi";
        names[2] = "Ian";
        names[3] = "Kaullet";
        names[4] = "Diego";
        //Imprimir los valores para verificar que se hayan guardado
        System.out.print("[" + names[0] + "]");
        System.out.print("[" + names[1] + "]");
        System.out.print("[" + names[2] + "]");
        System.out.print("[" + names[3] + "]");
        System.out.print("[" + names[4] + "]");
    }
}
