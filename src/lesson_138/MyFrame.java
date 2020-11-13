package lesson_138;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

//Урок №138. Java. Работаем с GUI. Переключатели
public class MyFrame extends JFrame {

    JTextField text;

    JRadioButton red, blue;

    public MyFrame(String str) {
        super(str);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JLabel label = new JLabel("MyNumber Label");  //метка
        label.setToolTipText("Label text");   //текст подсказка
        label.setText("Text");
        c.add(label);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel label2 = new JLabel("MyNumber Labe2");  //метка
        c.add(label2);

        text = new JTextField("Text");
        c.add(text);

        red = new JRadioButton("Red", true);
        c.add(red);

        blue = new JRadioButton("Blue", false);
        c.add(blue);

        Handler handler = new Handler();
        red.addItemListener(handler);
        blue.addItemListener(handler);

        ButtonGroup group = new ButtonGroup();
        group.add(red);
        group.add(blue);
        text.setBackground(Color.red);

        setSize(400, 150);

        setVisible(true);

    }

    class Handler implements ItemListener {
        Color color;

        public void itemStateChanged(ItemEvent e) {

            if (e.getSource() == red) text.setBackground(Color.red);
            else if (e.getSource() == blue) text.setBackground(Color.blue);
        }
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("MyNumber frame");
    }
}


