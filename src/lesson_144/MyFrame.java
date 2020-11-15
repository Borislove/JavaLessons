package lesson_144;

//Урок №144. Java. Классы - адаптеры (Часть 2)

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MyFrame extends JFrame {

    public MyFrame(String str) {
        super(str);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        setSize(300, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        addMouseListener(new MyMouse());
    }

    class MyMouse extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            if (e.isMetaDown()) JOptionPane.showMessageDialog(null, "Right");
            else if (e.isAltDown()) JOptionPane.showMessageDialog(null, "Middle");
            else JOptionPane.showMessageDialog(null, "Left");
        }
    }
}

class Main{
    public static void main(String[] args) {
        new MyFrame("Mouse ");
    }
}

