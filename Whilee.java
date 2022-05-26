public class Whilee {
    public static void main(String[] args) {
        //inicializar   condicion  actualizacion
        for(int i =0; i<=10; i++){
            for(int j=10; j>=10; j--){
                System.out.println(i + " x " + j + " = " + i*j);
                j = j -1;
            }
        }
    }
}
