public class Condiciones {
    public static void main(String[] args){
        //Declaramos las variables
        int operacion = 5;
        int num_uno = 8;
        int num_dos =4;
        int resultado = 0;
        //condiciones anidadas
        if(operacion == 1){
            resultado = num_uno + num_dos;
            System.out.println("El resultado de la suuma es: " + resultado);
            }else if(operacion ==2){
                resultado = num_uno - num_dos;
                System.out.println("El resultado de la resta es: " + resultado);
            }else if(operacion ==3){
                resultado = num_uno * num_dos;
                System.out.println("El resultado de la multilplicacion es: " + resultado);
            }else if(operacion ==4){
                resultado = num_uno / num_dos;
                System.out.println("El resultado de la divicion es: " + resultado);
        }else{
            System.out.println("Tu operacion no existe");
        }
    }
}
