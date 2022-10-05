package listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnListener implements ActionListener  {
    @Override
    public void actionPerformed(ActionEvent e) {
      //  System.out.println("event ocuured");
        JOptionPane.showMessageDialog(null,"for 2nd button, 2nd Listener");
    }
}
