package listener;

import javax.swing.*;
import java.awt.*;

public class Listener1 {
    public static void main(String[] args) {

        BtnListener bt=new BtnListener();
        BtnListener2 bt1= new
                BtnListener2();
        System.out.println("Hello Listener");
        JFrame jFrame=new JFrame("Hello Jframe");
        JButton jButton= new JButton("Display");
        jButton.addActionListener(bt);
        JButton jButton1= new JButton("2nd button");
        jFrame.add(jButton1);
        jButton1.addActionListener(bt1);
        jButton1.addActionListener(bt);
        jFrame.add(jButton);
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(800, 600);
        jFrame.setVisible(true);
    }

}
