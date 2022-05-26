import javax.swing.*;
public class InterfacesOne extends JFrame{
        private JLabel label1;
            //CONSTRUCTOR
            public InterfacesOne (){ 
            setLayout(null);
            label1 = new JLabel("Interfaces graficas en javaa");
            //POSICION DE LA ETIQUETA / DIMENSIONES 
            label1.setBounds(10,20, 200, 300);
            add(label1);
        }

    //Metodo mein
    public static void main(String[] args) {
        //Creamos objeto llamando al constructor
        InterfacesOne Interfaz1 = new InterfacesOne();
        //Damos posicionamiento del elemento
        Interfaz1.setBounds(0, 0, 400, 300);
        //Interfaz sea visible
        Interfaz1.setVisible(true);
        //Metodo que hace que aparezca al centro la interfaz
        Interfaz1.setLocationRelativeTo(null);
    }
}