package lesson_161;

import javax.swing.*;
import java.awt.*;

//Урок №161 Работа с многодокументным интерфейсом
//дочернее окно
public class MyFrame extends JFrame {

    JDesktopPane desktop;

    public MyFrame(String str) {
        super(str);

        Container c = getContentPane();
        desktop = new JDesktopPane();
        c.add(desktop);

        //
        JInternalFrame first = new JInternalFrame("First", true, true, true, true);

        JButton b1 = new JButton("First");
        Container c1 = first.getContentPane();
        c1.setLayout(new FlowLayout());
        c1.add(b1);

        first.setSize(100, 100);
        desktop.add(first);
        first.setVisible(true);

        //
        JInternalFrame second = new JInternalFrame("Second", false, true, true, true);
        second.setSize(100, 100);
        desktop.add(second);
        second.setVisible(true);

        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new MyFrame("Test");
    }
}
