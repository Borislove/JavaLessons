package lesson_145;

//Урок №145. Обработка событий клавиатуры

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class MyFrame extends JFrame implements KeyListener {

    public MyFrame(String str) {
        super(str);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        setSize(300, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        addKeyListener(this);
    }

    public void keyPressed(KeyEvent e) {
        JOptionPane.showMessageDialog(null, e.getKeyText(e.getKeyCode()));
    }

    public void keyReleased(KeyEvent e) {
        JOptionPane.showMessageDialog(null, e.getKeyText(e.getKeyCode())); //какую клавишу отпустили

    }

    public void keyTyped(KeyEvent e) {
        JOptionPane.showMessageDialog(null, "" + e.getKeyChar()); //unikod
    }
}

class Main {
    public static void main(String[] args) {
        new MyFrame("Keyboard ");
    }
}

