public class Swichandcase{
    public static void main(String[] args) {
        //Estructuras de control Swicht And Case

        //Definimos variables
        int num_uno =5, num_dos = 3, resultado = 0, parametro =2;

        /*solo permite porner un char y un int 
        Recordemos que char solo permite un carcter y un int es un numero entero*/
        switch(parametro){
            //Si case es 1 se ejecuta, si no continua leyendo el codigo ~ toma de decisiones 
            case 1: System.out.println("el parametro vale 1");
                break;
            case 2: resultado = num_uno + num_dos;
                    System.out.println("El resultado de la suma es >> " + resultado);
                break;
            /*Si la opcion no existe */ 
            default: System.out.println("la opcion no existe");
                break;
                //Despues de cada decision y defalut es necesario poner un break 
        }
    }
}