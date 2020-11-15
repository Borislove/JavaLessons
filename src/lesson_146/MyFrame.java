package lesson_146;

//Урок №146. Менеджеры расположения. FlowLayout

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    FlowLayout layout;

    public MyFrame(String str) {
        super(str);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        layout = new FlowLayout();
        c.setLayout(layout);
        //layout.setAlignment(FlowLayout.RIGHT);
        //layout.setAlignment(FlowLayout.LEFT);
        layout.setAlignment(FlowLayout.CENTER);

        JButton b1 = new JButton("First");
        JButton b2 = new JButton("Second");
        JButton b3 = new JButton("Third");

       /* layout.setAlignment(FlowLayout.RIGHT);
        layout.layoutContainer(c);*/

        c.add(b1);
        c.add(b2);
        c.add(b3);

        setSize(300, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }
}

class Main {
    public static void main(String[] args) {
        new MyFrame("Keyboard ");
    }
}

