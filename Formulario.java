import javax.swing.*;
import java.awt.event.*;
public class Formulario extends JFrame implements ActionListener{
    
    //Dise;o del boton
    JButton btn1;
    public Formulario(){
        setLayout(null);
        btn1 = new JButton("cerrar");
        btn1.setBounds(300, 250, 100, 30);
        add(btn1);
        btn1.addActionListener(this);
    }
    //Capturar el evento del raton
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn1){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        Formulario form1 = new Formulario();
        form1.setBounds(0,0,400,350);
        form1.setVisible(true);
        form1.setResizable(true);
        form1.setLocationRelativeTo(null);
    }
}
