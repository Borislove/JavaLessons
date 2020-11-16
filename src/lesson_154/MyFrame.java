package lesson_154;

import javax.swing.*;
import java.awt.*;
//Урок №154. Java. Изучаем GUI. Классы окон
public class MyFrame extends JFrame {
    public MyFrame(String str) {
        super(str);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());


        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}

