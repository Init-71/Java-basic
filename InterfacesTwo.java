import javax.swing.*;

public class InterfacesTwo extends JFrame{
    // CONSTRUCTOR //
    public InterfacesTwo(){
        setLayout(null);
    }

    //Método Main 
    public static void main(String[] args) {
        InterfacesTwo two = new InterfacesTwo();
        /* derecha/izquierda - height - width - height de la interfaz*/ 
        two.setBounds(0, 100, 400, 550);
        two.setVisible(true);
        two.setLocationRelativeTo(null);
        two.setResizable(false);
    }
}
