import java.util.Scanner;
public class Purificadora {
    public static void main(String[] args) {
        
        //Definimos variables
        float monthBefore = 134.50f;
        int monthAfter = 269;
        int personalizado=0;
        //Teclado 
        Scanner teclado = new Scanner(System.in);

        System.out.println("El valor a pagar por los primeros seis meses es de> " + monthBefore * 6 + " $");
        System.out.println("Despues de los primeros meses se pagara 269 pesos mensualmente");
        System.out.println("Digite el numero de meses que desea contratar para calcular el valor: ");
        personalizado = teclado.nextInt();
        System.out.println("Ustede pagara: " + monthAfter * personalizado + " $");
    }
}
