import javax.swing.*;
import java.awt.event.*;

public class BtnandEtiq extends JFrame implements ActionListener{
    private JButton btn1, btn2, btn3, cls; 
    private JLabel label1;
    //constructor / estilar elementos
    public BtnandEtiq(){
        setLayout(null);
        btn1 = new JButton("1");
        btn1.setBounds(10, 100, 90, 30);
        add(btn1);
        btn1.addActionListener(this);
        //boton 2
        btn2 = new JButton("2");
        btn2.setBounds(110, 100, 90, 30);
        add(btn2);
        btn2.addActionListener(this);
        //boton 3
        btn3 = new JButton("3");
        btn3.setBounds(210, 100, 90, 30);
        add(btn3);
        btn3.addActionListener(this);
        //label 
        label1 = new JLabel("En espera....");
        label1.setBounds(10,10,300,30);
        add(label1);

        //close program
        cls = new JButton("cerrar");
        cls.setBounds(10, 210, 100, 25);
        add(cls);
        cls.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn1){
            label1.setText("Has presionado el boton 1");
        }
        if(e.getSource() == btn2){
            label1.setText("Has presionado el boton 2");
        }
        if(e.getSource() == btn3){
            label1.setText("Has presionado el boton 3");
        }
        if(e.getSource() == cls){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        BtnandEtiq inter = new BtnandEtiq();
        inter.setBounds(0,0, 400, 350);
        inter.setVisible(true);
        inter.setLocationRelativeTo(null);
        inter.setResizable(false);
    }
}
