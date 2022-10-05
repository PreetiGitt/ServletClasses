package listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnListener2 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        JOptionPane.showMessageDialog(null,"for 2nd button");
    }
}
