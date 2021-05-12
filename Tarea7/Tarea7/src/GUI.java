import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame {
    private JButton boton_1,boton_2, boton_3;
    private static int a = 0;
    
    public GUI(){
        super("GUI");
        setLayout(new FlowLayout());
        JPanel panel = new JPanel();

        boton_1 = new JButton("1");
        boton_1.setPreferredSize(new Dimension(50,50));
        boton_1.setBackground(Color.RED);
        boton_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) { 
                bt1_actionPerformed(e);
            } 
        });

        boton_2 = new JButton("2");
        boton_2.setPreferredSize(new Dimension(50,50));
        boton_2.setBackground(Color.CYAN);
        boton_2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) { 
                bt2_actionPerformed(e);
            } 
        });

        boton_3 = new JButton("3");
        boton_3.setPreferredSize(new Dimension(50,50));
        boton_3.setBackground(Color.GRAY);
        boton_3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) { 
                bt3_actionPerformed(e);
            } 
        });

        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(boton_1);
        panel.add(boton_2);
        panel.add(boton_3);

        add(panel);
        setSize(300,100);
        setLocationRelativeTo(null);
        
        //Para cancelar la ejecución del programa
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }
    
    private void bt1_actionPerformed(ActionEvent l) { 
        a++;
        try{
            boton_1.setEnabled(false);
            if(a != 1){
                switch(a){
                    case 2: boton_1.setEnabled(true);
                            boton_2.setEnabled(true);
                            boton_3.setEnabled(true);
                            a = 0;
                            break;
                    case 3: boton_1.setEnabled(true);
                            boton_2.setEnabled(true);
                            boton_3.setEnabled(true);
                            a = 0;
                            break;        
                }
                throw new Exception("Orden incorrecto"); 
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Presione los botones en el orden de los números");
        }
    } 
    
    private void bt2_actionPerformed(ActionEvent l) { 
        a++;
        try{
            boton_2.setEnabled(false);
            switch(a){}
            if(a != 2){
                switch(a){
                    case 1: boton_1.setEnabled(true);
                            boton_2.setEnabled(true);
                            boton_3.setEnabled(true);
                            a = 0;
                            break;
                    case 3: boton_1.setEnabled(true);
                            boton_2.setEnabled(true);
                            boton_3.setEnabled(true);
                            a = 0;
                            break;        
                }
                throw new Exception("Orden incorrecto");
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Presione los botones en el orden de los números");
        }
    } 

    private void bt3_actionPerformed(ActionEvent l) { 
        a++;
        try{
            boton_3.setEnabled(false);
            if(a != 3){
                switch(a){
                    case 1: boton_1.setEnabled(true);
                            boton_2.setEnabled(true);
                            boton_3.setEnabled(true);
                            a = 0;
                            break;
                    case 2: boton_1.setEnabled(true);
                            boton_2.setEnabled(true);
                            boton_3.setEnabled(true);
                            a = 0;
                            break;       
                }
                throw new Exception("Orden incorrecto");
            }else if(a==3){
                boton_1.setEnabled(true);
                boton_2.setEnabled(true);
                boton_3.setEnabled(true);
                a = 0;
                JOptionPane.showMessageDialog(null, "Bien Hecho!!");
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Presione los botones en el orden de los números");
        }
    } 

    public static void main(String[] args) throws Exception {
        new GUI().setVisible(true);     
    }
}