package lesson_147;

//Урок №147. Менеджеры расположения. BorderLayout

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    BorderLayout layout;

    public MyFrame(String str) {
        super(str);
        Container c = getContentPane();

        layout = new BorderLayout(4, 4); //зазоры

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");

        //c.add(b1, BorderLayout.NORTH);
        //c.add(b2, BorderLayout.SOUTH);
        c.add(b3, BorderLayout.WEST);
        c.add(b4, BorderLayout.EAST);
        c.add(b5, BorderLayout.CENTER);

        setSize(300, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}

class Main {
    public static void main(String[] args) {
        new MyFrame("BorderLayout ");
    }
}


