//SUCESION FIBONACCI 
public class Fibonacci{
    public static void main(String[] args) {
        //Definimos las variables 0, 1 y 0 para poder realizar la sucesion
        int a = 0, b = 1, c = 0;
        //Iteramos en un for para realizar la sucesion 10 veces y mostrarlo en pantalla
        for(int i = 0; i < 10; i++){
            System.out.print(a + ",");
            /*valor de | a | más b lo guarda en la varible | c |*/
            c = a+b;
            /*valor de | b | lo guarda en la varible | a |*/
            a = b;
            /*valor de | c | lo guarda en la variable | b |*/
            b = c;
        }
    }
}