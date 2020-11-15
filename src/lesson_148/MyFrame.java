package lesson_148;

import javax.swing.*;
import java.awt.*;

//Урок №148. Менеджеры расположения. GridLayout
public class MyFrame extends JFrame {

    GridLayout layout;

    public MyFrame(String str) {
        super(str);
        Container c = getContentPane();

        //layout = new GridLayout(3, 2); //строки и столбы
        layout = new GridLayout(3, 2, 5,5); //зазоры
        c.setLayout(layout);

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
        c.add(b6);

        setSize(300, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}

class Main {
    public static void main(String[] args) {
        new MyFrame("GridLayout ");
    }
}


