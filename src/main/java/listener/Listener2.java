package listener;

import javax.swing.*;
import java.awt.*;

public class Listener2 {
    public static void main(String[] args) {

        MultipleSrcListener multipleSrcListener=new MultipleSrcListener();
        JFrame jFrame=new JFrame("Hello Jframe");
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(800, 600);
        jFrame.setVisible(true);
       JTextField jTextField= new JTextField(10);
       jFrame.add(jTextField);
       jTextField.addKeyListener(multipleSrcListener);

    }

}
