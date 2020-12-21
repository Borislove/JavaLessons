package lesson_160;

//Урок №160. Java. Настраиваемый программный интерфейс

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    JComboBox box;
    JTextArea text;
    JButton button;
    JRadioButton metal;
    JRadioButton motif;
    JRadioButton windows;

    public MyFrame(String str) {
        super(str);

        String [] s = {"1","2","3"};

        box = new JComboBox(s);
        text = new JTextArea("Text");
        button = new JButton("Text");

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(box);
        c.add(text);
        c.add(button);

        metal = new JRadioButton("Metal");
        motif = new JRadioButton("");

        setSize(300, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }


    public static void main(String[] args) {
        new MyFrame("");
    }
}





