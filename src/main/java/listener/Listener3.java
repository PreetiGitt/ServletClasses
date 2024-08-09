package listener;

import javax.swing.*;
import java.awt.*;

public class Listener3 {
    public static void main(String[] args) {


        MultipleSrcListener2 multipleSrcListener2=new
                MultipleSrcListener2();
        JFrame jFrame=new JFrame("Hello Jframe");
        JButton jButton= new JButton("Display");
        jFrame.add(jButton);
        jButton.addActionListener(multipleSrcListener2);
        JTextField jTextField=new JTextField(10);
        jFrame.add(jTextField);
        jTextField.addKeyListener(multipleSrcListener2);
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(800, 600);
        jFrame.setVisible(true);
    }

}
