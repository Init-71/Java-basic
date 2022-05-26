import javax.swing.*;
public class Interfaces3 extends JFrame {
    //Declaramos elementos que vamos a usar
    private JLabel label1;
    private JLabel label2;
    //construcutr
    public Interfaces3(){ 
        setLayout(null);
        label1 = new JLabel("Interfaz grafica");
        label1.setBounds(10, 20, 300, 30);
        add(label1);
        label2 = new JLabel("Version 1.0 Interfaz");
        label2.setBounds(10, 100, 100, 30);
        add(label2);
    }
    public static void main(String[] args) {
        Interfaces3 nuevoObj = new Interfaces3();
        nuevoObj.setBounds(0,0, 300, 200);
        nuevoObj.setResizable(false);
        nuevoObj.setVisible(true);
        nuevoObj.setLocationRelativeTo(null);
    }
}
