package lesson_139;

//Урок №139. Java. Работаем с GUI. Выпадающий список

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyFrame extends JFrame {

    JTextField text;

    JComboBox box;
    String[] colors = {"red", "blue", "green"};

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

        box = new JComboBox(colors);
        box.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    if (box.getSelectedIndex() == 0)
                        text.setBackground(Color.red);
                    else if (box.getSelectedIndex() == 1) text.setBackground(Color.blue);
                } else text.setBackground((Color.green));
            }
        });

        c.add(box);

        setSize(400, 150);

        setVisible(true);

    }


    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("MyNumber frame");
    }
}



