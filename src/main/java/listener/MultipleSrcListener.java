package listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MultipleSrcListener implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("KeyTyped");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("KeyPress");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key Release");
    }
}
