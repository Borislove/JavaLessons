package lesson_143;

//Урок №143. Java. Классы - адаптеры (Часть 1)

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MyFrame extends JFrame {

    JTextField text;
    int x = 0;
    int y = 0;

    public MyFrame(String str) {
        super(str);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        text = new JTextField("                                   ");
        c.add(text);

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });
        ;

        setSize(300, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void paint(Graphics g) {
        g.fillRect(x, y, 2, 2);
    }


    public static void main(String[] args) {
        //  MyFrame myFrame = new MyFrame("MyNumber frame");
        new MyFrame("Mouse ");
    }
}



